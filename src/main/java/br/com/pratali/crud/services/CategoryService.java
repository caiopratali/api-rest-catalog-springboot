package br.com.pratali.crud.services;

import br.com.pratali.crud.entities.Category;
import br.com.pratali.crud.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    @Transactional(readOnly = true)
    public List<Category> fingAll () {
        return repository.findAll();
    }

}
