CREATE DATABASE IF NOT EXISTS db_lavacao;
USE db_lavacao;

/*
TABELA PARA CRIAR O BANCO DO SISTEMA NORTEADOR
*/

CREATE TABLE IF NOT EXISTS marca(
    id int NOT NULL auto_increment,
    nome varchar(50) NOT NULL,
    CONSTRAINT pk_marca PRIMARY KEY(id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS cor(
    id int NOT NULL auto_increment,
    nome varchar(50) NOT NULL,
    CONSTRAINT pk_cor PRIMARY KEY(id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS servico(
    id int NOT NULL auto_increment,
    descricao varchar(150) NOT NULL,
    valor decimal(10,2) NOT NULL,
    pontos int NOT NULL DEFAULT 0,
    categoria ENUM('PEQUENO', 'MEDIO', 'GRANDE', 'MOTO', 'PADRAO') NOT NULL DEFAULT 'PADRAO',
    CONSTRAINT pk_servico PRIMARY KEY(id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS modelo(
    id int NOT NULL auto_increment,
    descricao varchar(150) NOT NULL,
    id_marca int NOT NULL,
    CONSTRAINT pk_modelo
      PRIMARY KEY(id),
    CONSTRAINT fk_modelo_marca
      FOREIGN KEY(id_marca)
      REFERENCES marca(id)
) engine=InnoDB;

/*TABELA MOTOR COM RELACIONAMENTO 1:1 PARA MODELO - COMPOSIÇÃO*/
CREATE TABLE IF NOT EXISTS motor(
    id_modelo int NOT NULL REFERENCES modelo(id),
    potencia int NOT NULL DEFAULT 0,
    tipo_combustivel ENUM('GASOLINA', 'ETANOL', 'FLEX', 'DIESEL', 'GNV', 'OUTRO') 
    NOT NULL DEFAULT 'GASOLINA',
    CONSTRAINT pk_motor 
        PRIMARY KEY (id_modelo),
    CONSTRAINT fk_motor_modelo 
        FOREIGN KEY (id_modelo) REFERENCES modelo(id) ON DELETE CASCADE
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS veiculo(
    id int NOT NULL auto_increment,
    placa varchar(10) NOT NULL,
    observacoes varchar(350) NOT NULL,
    id_modelo int NOT NULL,
    id_cor int NOT NULL,
    CONSTRAINT pk_veiculo
      PRIMARY KEY(id),
    CONSTRAINT fk_veiculo_modelo
      FOREIGN KEY(id_modelo)
      REFERENCES modelo(id),
    CONSTRAINT fk_veiculo_cor
      FOREIGN KEY(id_cor)
      REFERENCES cor(id)
) engine=InnoDB;

INSERT INTO marca(nome) VALUES('');
INSERT INTO marca(nome) VALUES('');
INSERT INTO marca(nome) VALUES('');

INSERT INTO cor(nome) VALUES('');
INSERT INTO cor(nome) VALUES('');
INSERT INTO cor(nome) VALUES('');

INSERT INTO servico(descricao, valor, pontos, categoria) VALUES('','','','');
INSERT INTO servico(descricao, valor, pontos, categoria) VALUES('','','','');
INSERT INTO servico(descricao, valor, pontos, categoria) VALUES('','','','');

INSERT INTO modelo(descricao, id_marca) VALUES('','');
INSERT INTO motor(id_modelo) (SELECT max(id) FROM modelo);
INSERT INTO modelo(descricao, id_marca) VALUES('','');
INSERT INTO motor(id_modelo) (SELECT max(id) FROM modelo);
INSERT INTO modelo(descricao, id_marca) VALUES('','');
INSERT INTO motor(id_modelo) (SELECT max(id) FROM modelo);


INSERT INTO veiculo(placa, observacoes, id_modelo, id_cor) VALUES('','','','');
INSERT INTO veiculo(placa, observacoes, id_modelo, id_cor) VALUES('','','','');
INSERT INTO veiculo(placa, observacoes, id_modelo, id_cor) VALUES('','','','');

UPDATE motor SET potencia=200, tipo_combustivel='GASOLINA' WHERE id_modelo = 1;
UPDATE motor SET potencia=250, tipo_combustivel='DIESEL' WHERE id_modelo = 2;
UPDATE motor SET potencia=300, tipo_combustivel='GASOLINA' WHERE id_modelo = 3;