package com.example.demo.repository;


import com.example.demo.model.UserModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<UserModel> list = new ArrayList<>();

    @PostConstruct
    public void loadList() {
       list.add(new UserModel(1l, "felipe", "smith00", "felipeclasher@gmail.com"));
        list.add(new UserModel(2l, "gabriel", "smith0", "felipeclasher@gmail.com"));
        list.add(new UserModel(3l, "kadu", "smith01", "felipeclasher@gmail.com"));

    }

    public List<UserModel> getAll() {
        return this.list;
    }

//    public boolean deletar(Long id) {
//        ContasPagar conta = getById(id);
//        if (conta != null) {
//            return list.remove(conta);
//        }
//        return false;
//    }
//
//    public ContasPagar getById(Long id) {
//        for (ContasPagar conta : this.list) {
//            if (conta.getId() == id)
//                return conta;
//        }
//        return new ContasPagar();
//    }
//
//    public ContasPagar addConta(ContasPagar conta) {
//        ContasPagar contaExistente = getById(conta.getId());
//
//        if (contaExistente.getId() != null) {
//            contaExistente.setName(conta.getName());
//            contaExistente.setDataVencimento(conta.getDataVencimento());
//            return contaExistente;
//        }
//        list.add(conta);
//        return conta;
//    }
}
