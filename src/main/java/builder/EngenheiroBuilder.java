package main.java.builder;

import java.util.Date;

public class EngenheiroBuilder {
    private Engenheiro engenheiro;

    public EngenheiroBuilder(){
        engenheiro = new Engenheiro();
    }

    public Engenheiro build(){
        if(engenheiro.getRegistro() == 0){
            throw new IllegalArgumentException("Registro inválido");
        }

        if(engenheiro.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }

        if(engenheiro.getCargo().equals("")){
            throw new IllegalArgumentException("Cargo inválido");
        }

        return engenheiro;
    }

    public EngenheiroBuilder setRegistro(int registro){
        engenheiro.setRegistro(registro);
        return this;
    }

    public EngenheiroBuilder setNome(String nome){
        engenheiro.setNome(nome);
        return this;
    }

    public EngenheiroBuilder setCargo(String cargo){
        engenheiro.setCargo(cargo);
        return this;
    }

    public EngenheiroBuilder setDataNascimento(Date data){
        engenheiro.setDataNascimento(data);
        return this;
    }

    public EngenheiroBuilder setCpf(String cpf){
        engenheiro.setCpf(cpf);
        return this;
    }

    public EngenheiroBuilder setRg(String rg){
        engenheiro.setRg(rg);
        return this;
    }

    public EngenheiroBuilder setEnderecoLogradouro(String enderecoLogradouro){
        engenheiro.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public EngenheiroBuilder setEnderecoNumero(int numero){
        engenheiro.setEnderecoNumero(numero);
        return this;
    }

    public EngenheiroBuilder setEnderecoComplemento(String complemento){
        engenheiro.setEnderecoComplemento(complemento);
        return this;
    }

    public EngenheiroBuilder setEnderecoBairro(String bairro){
        engenheiro.setEnderecoBairro(bairro);
        return this;
    }

    public EngenheiroBuilder setEnderecoCidade(String cidade){
        engenheiro.setEnderecoCidade(cidade);
        return this;
    }

    public EngenheiroBuilder setEnderecoUF(String uf){
        engenheiro.setEnderecoUF(uf);
        return this;
    }

    public EngenheiroBuilder setCep(String cep){
        engenheiro.setCep(cep);
        return this;
    }

    public EngenheiroBuilder setEmail(String email){
        engenheiro.setEmail(email);
        return this;
    }

    public EngenheiroBuilder setCelular(String celular){
        engenheiro.setCelular(celular);
        return this;
    }
}
