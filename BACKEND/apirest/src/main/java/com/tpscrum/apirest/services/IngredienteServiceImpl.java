package com.tpscrum.apirest.services;

import com.tpscrum.apirest.entities.Ingrediente;
import com.tpscrum.apirest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredienteServiceImpl extends BaseServiceImpl<Ingrediente, Integer>{
    public IngredienteServiceImpl(BaseRepository<Ingrediente, Integer> baseRepository) {
        super(baseRepository);
    }
}
