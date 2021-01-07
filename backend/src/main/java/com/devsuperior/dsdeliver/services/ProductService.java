package com.devsuperior.dsdeliver.services;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

// Service é a camada que se comunica com o repositório (banco de dados). Ela é acionada pelos controladores REST
// Controladores REST < Se comunica através de Data Transfer Objects (DTO) > Camada de Serviço <-> Camada de acesso a dados
//                                                                                             <-> Entidades
// DTO é um objeto para carregar os dados

// Registra que é um componente que poderá ser injetado em outros componentes
@Service
public class ProductService {

    // ProductService precisa do ProductRespository, já que ele é quem cutuca a classe que acessa o repositório (banco de dados)
    // Poderíamos fazer:
    //      private ProductRepository repository = new ProductRepository;
    // Mas assim, se teria um acoplamento forte. Uma alternativa sem usar o Spring seria usar um construtor:
    //      public ProductService(ProductRepository repository) {this.repository = repository;}
    @Autowired
    private ProductRepository repository;

    // Para garantir que não haverá travamento para escrita no banco de dados, torna a operação mais rápida
    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByNameAsc();
        // Cria um novo ProductDTO para cada Produto da lista, usando o construtor com objeto que há em ProductDTO
        return list.stream().map(x -> new ProductDTO(x))
                // Transforma de volta em uma lista, se não, cada resultado seria retornado individualmente
                .collect(Collectors.toList());
    }
}
