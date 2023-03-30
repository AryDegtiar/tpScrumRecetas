package com.tpscrum.apirest.controllers;

import com.tpscrum.apirest.entities.Receta;
import com.tpscrum.apirest.services.RecetaSerciceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/recetas")
public class RecetaController extends BaseControllerImpl<Receta, RecetaSerciceImpl> {

}