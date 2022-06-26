package cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.domain.Sucursal;

@Repository
public interface SucursalRepo extends JpaRepository<Sucursal, Integer> {

}
