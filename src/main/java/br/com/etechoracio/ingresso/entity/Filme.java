package br.com.etechoracio.ingresso.entity;

import br.com.etechoracio.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingresso.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_FILME")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME")
    private Long id;

    @Column(name = "TX_NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "NR_DURACAO", nullable = false)
    private Integer duracao;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_CATEGORIA", nullable = false, length = 17)
    private CategoriaFilmeEnum genero;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_CLASSIFICACAO", length = 5)
    private ClassificacaoIndicativaEnum classificacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "CHK_EM_CARTAZ", length = 1)
    private SimNaoEnum emCartaz;

    @Column(name = "NR_ANO")
    private Integer ano;

    @Column(name = "TX_CAPA", length = 350)
    private String capa;

    @Column(name = "TX_DIRETOR", length = 300)
    private String diretor;

    @Column(name = "TX_ELENCO", length = 300)
    private String elenco;

    @Column(name = "TX_DESCRICAO", length = 500)
    private String descricao;

    @Column(name = "NR_AVALIACAO")
    private Double avaliacao;
}