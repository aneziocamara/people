package com.almada.people.service;

import com.almada.people.dto.request.PersonRequestDTO;
import com.almada.people.dto.response.PersonResponseDTO;
import com.almada.people.repository.PersonRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Override
    public PersonResponseDTO findById(long id) {
        personRepository.findById(id).orElseThrow(()-> new RuntimeException("Person wasn't found on database."));
        return null;
    }

    @Override
    public List<PersonResponseDTO> findAll() {
        return List.of();
    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personRequestDTO) {
        return "";
    }

    @Override
    public PersonResponseDTO register(PersonResponseDTO personResponseDTO) {
        return "";
    }

    @Override
    public PersonResponseDTO update(PersonRequestDTO personRequestDTO, Long id) {
        personRepository.findById(id).orElseThrow(()-> new RuntimeException("Person wasn't found on database."));
        return null;
    }

    @Override
    public PersonResponseDTO update(PersonRequestDTO personRequestDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return "";
    }
}
