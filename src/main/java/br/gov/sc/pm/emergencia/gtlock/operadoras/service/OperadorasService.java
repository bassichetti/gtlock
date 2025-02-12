package br.gov.sc.pm.emergencia.gtlock.operadoras.service;

import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Operadoras;
import br.gov.sc.pm.emergencia.gtlock.operadoras.repository.OperadorasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OperadorasService {

    private final OperadorasRepository operadorasRepository;

    //Salvando operadora
    public Operadoras salvar(Operadoras operadoras) {
        return operadorasRepository.save(operadoras);
    }

    //Atualizando operadort
    public void atualizar(Operadoras operadoras) {
        operadorasRepository.save(operadoras);
    }

    //Obter operadora por id
    public Optional<Operadoras> obterPorId(Long id) {
        return operadorasRepository.findById(id);
    }

    //Deletar por id
    public  Optional<Operadoras> deletarById(Long id) {
        Optional<Operadoras> op = operadorasRepository.findById(id);
        op.ifPresent(operadorasRepository::delete);
        return op;
    }
}
