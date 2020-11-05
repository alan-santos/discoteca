# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table discos (
  id                            bigint auto_increment not null,
  titulo                        varchar(255) not null,
  artista                       varchar(255),
  gravado                       boolean not null,
  condicao                      varchar(1) not null,
  constraint ck_discos_condicao check ( condicao in ('A','B','C','D','E')),
  constraint pk_discos primary key (id)
);


# --- !Downs

drop table if exists discos;

