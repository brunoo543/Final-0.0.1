CREATE TABLE categorias (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  nome VARCHAR( 255 ) NOT NULL
) ;

CREATE TABLE `produtos` (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  categoria_id INT NOT NULL ,
  nome VARCHAR( 255 ) NOT NULL ,
  preco DECIMAL( 10,2 ) NOT NULL
) 