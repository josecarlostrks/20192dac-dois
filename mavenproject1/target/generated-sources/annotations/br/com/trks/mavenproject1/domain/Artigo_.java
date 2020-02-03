package br.com.trks.mavenproject1.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T20:47:43")
@StaticMetamodel(Artigo.class)
public class Artigo_ { 

    public static volatile SingularAttribute<Artigo, String> coorientadores;
    public static volatile SingularAttribute<Artigo, String> titulo;
    public static volatile SingularAttribute<Artigo, String> urlDownload;
    public static volatile SingularAttribute<Artigo, Integer> id;
    public static volatile SingularAttribute<Artigo, String> orientador;
    public static volatile SingularAttribute<Artigo, Date> dataSubmissao;
    public static volatile SingularAttribute<Artigo, String> modalidade;

}