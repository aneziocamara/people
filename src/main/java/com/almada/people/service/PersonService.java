package com.almada.people.service;


import com.almada.people.dto.request.PersonRequestDTO;
import com.almada.people.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personRequestDTO);

    PersonResponseDTO register(PersonResponseDTO personResponseDTO);

    PersonResponseDTO update(PersonRequestDTO personRequestDTO, Long id);

    PersonResponseDTO update(PersonRequestDTO personRequestDTO);

    String delete(Long id);
}
