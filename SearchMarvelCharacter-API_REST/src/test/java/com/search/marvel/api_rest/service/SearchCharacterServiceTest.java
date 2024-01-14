package com.search.marvel.api_rest.service;

import com.search.marvel.api_rest.ClienteMarvelApplication;
import com.search.marvel.api_rest.repository.BitacoraAccesoMarvelEntity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SearchCharacterServiceTest {

    @Test
    void getAllCharacters() {

        int characterId = 0;
        SearchCharacterService marvelService = new SearchCharacterServiceImpl();

        String characterName = marvelService.getCharacters(characterId);

        assertNotNull(characterName);

    }

    @Test
    void getAllCharacterById() {

        int characterId = 1011334;
        /**
         * Id: 1011334
         * Charcter: 3-D Man
         * */

        SearchCharacterService marvelService = new SearchCharacterServiceImpl();

        String characterName = marvelService.getCharacters(characterId);

        assertNotNull(characterName);

    }

    @Test
    void getDataBitacora() {

        SearchCharacterService marvelService = new SearchCharacterServiceImpl();

        List<BitacoraAccesoMarvelEntity> datosBitacora = marvelService.getDataBitacora();

        assertNotNull(datosBitacora);

    }
}