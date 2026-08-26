package com.example.DTO;

import java.io.Serializable;

// Serializable transforma em bytes
public class EstoqueDTO implements Serializable{
    public String nomeProduto;
    public int quantidade;
}
