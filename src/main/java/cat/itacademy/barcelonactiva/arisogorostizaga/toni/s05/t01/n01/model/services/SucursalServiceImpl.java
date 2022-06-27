package cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.repository.SucursalRepo;

@Service
public class SucursalServiceImpl implements SucursalService {

	@Autowired
	private SucursalRepo sucursalRepo;

	@Override
	public SucursalDTO convertEntityToDTO(Sucursal sucursal) {
		
		SucursalDTO sucursalDTO = new SucursalDTO();
		
		sucursalDTO.setPk_SucursalID(sucursal.getPk_SucursalID());
		sucursalDTO.setNomSucursal(sucursal.getNomSucursal());
		sucursalDTO.setPaisSucursal(sucursal.getPaisSucursal());
		
		if (sucursalDTO.getPaisos().contains(sucursalDTO.getPaisSucursal())) {
			sucursalDTO.setTipusSucursal("UE");
		} else {
			sucursalDTO.setTipusSucursal("Fora UE");
		}
		return sucursalDTO;
	}
	
	@Override
	public Sucursal convertDTOtoEntity(SucursalDTO sucursalDTO) {
		
        Sucursal sucursal = new Sucursal();
        
        sucursal.setPk_SucursalID(sucursalDTO.getPk_SucursalID());
        sucursal.setNomSucursal(sucursalDTO.getNomSucursal());
        sucursal.setPaisSucursal(sucursalDTO.getPaisSucursal());

        return sucursal;
	}

	@Override
	public List<SucursalDTO> getAll() {
		
		List<SucursalDTO> listaSucursalesDTO = new ArrayList<SucursalDTO>();

		List<Sucursal> listaSucursales = sucursalRepo.findAll();
		if (listaSucursales != null && listaSucursales.size() > 0) {
			for (Sucursal sucursal : listaSucursales) {
				listaSucursalesDTO.add(this.convertEntityToDTO(sucursal));
			}
		}
		
		return listaSucursalesDTO;
	}

	@Override
	public SucursalDTO getOne(Integer id) {
		SucursalDTO sucursalDTO = new SucursalDTO();
		Optional<Sucursal> sucursal = sucursalRepo.findById(id);
		if (sucursal.isPresent()) {
			sucursalDTO = this.convertEntityToDTO(sucursal.get());
		}

		return sucursalDTO;
	}

	@Override
	public void delete(Integer id) {
		sucursalRepo.deleteById(id);
	}

	@Override
	public void add(SucursalDTO sucursalDTO) {
		sucursalRepo.save(convertDTOtoEntity(sucursalDTO));

	}
	


}
