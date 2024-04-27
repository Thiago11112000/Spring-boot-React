package br.com.api.produtos.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name= "produtos")
public class ProdutoModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String marca;
}
