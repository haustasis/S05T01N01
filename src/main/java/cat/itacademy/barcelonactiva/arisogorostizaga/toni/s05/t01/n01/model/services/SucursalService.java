package cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.dto.SucursalDTO;

public interface SucursalService {
	
	public SucursalDTO convertEntityToDTO(Sucursal sucursal);
	public Sucursal convertDTOtoEntity(SucursalDTO sucursalDTO);
	public List<SucursalDTO> getAll();
	public SucursalDTO getOne(Integer id);
	public void delete(Integer id);
	public void add(SucursalDTO sucursal);
	

}
