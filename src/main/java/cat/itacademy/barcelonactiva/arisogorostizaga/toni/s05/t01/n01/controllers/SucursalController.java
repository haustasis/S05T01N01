package cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.arisogorostizaga.toni.s05.t01.n01.model.services.SucursalService;

@Controller
public class SucursalController {

	@Autowired
	private SucursalService sucursalService;
	
	@GetMapping({"/sucursal/getAll", "/"})
	public String getAll(Model model) {
		model.addAttribute("getAll", sucursalService.getAll());
		return "getAll";
	}
	
	@GetMapping("/sucursal/add")
	public String add(Model model) {
		SucursalDTO sucursalDTO = new SucursalDTO();
		model.addAttribute("add", sucursalDTO);
		return "add";
	}
	
	@PostMapping("/sucursal/add")
	public String add(@ModelAttribute("sucursalDTO") SucursalDTO sucursalDTO) {
		sucursalService.add(sucursalDTO);
		return "redirect:/sucursal/getAll";
	}
	
	
	@GetMapping("/sucursal/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		SucursalDTO sucursalDTO = sucursalService.getOne(id);
		model.addAttribute("update", sucursalDTO);	
		return "update";
	}
	
	@GetMapping("/sucursal/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id) {
		sucursalService.delete(id);
		return "redirect:/sucursal/getAll";
	}
	
	
	
}
