package com.tpscrum.apirest.services;

import com.tpscrum.apirest.entities.Receta;
import com.tpscrum.apirest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class RecetaSerciceImpl extends BaseServiceImpl<Receta, Integer> {
    public RecetaSerciceImpl(BaseRepository<Receta, Integer> baseRepository) {
        super(baseRepository);
    }
}