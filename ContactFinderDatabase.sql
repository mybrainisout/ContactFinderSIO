drop database ContactFinder;
create database ContactFinder;
use ContactFinder;

create table contact(
cont_ID int not null AUTO_INCREMENT,
cont_nom varchar(100) not null,
cont_prenom varchar(150)not null,
cont_societe varchar(150),
cont_adresse1 varchar(150),
cont_adresse2 varchar(150),
cont_cp  varchar(5),
cont_ville varchar(100),
cont_email varchar(150),
cont_tel varchar(15),
cont_tel2 varchar(15),
cont_user_ID int not null,
constraint pk_contact primary key(cont_ID));

create table utilisateur(
user_ID int not null AUTO_INCREMENT,
user_Login varchar(100) not null,
user_password varchar(100) not null,
constraint pk_utilisateur primary key(user_ID));

alter table contact
add constraint fk_contact_cont_user_ID
foreign key(cont_user_ID)
references utilisateur(user_ID);

Insert into utilisateur(user_Login, user_password)
values
('Alex', 2211);

insert into contact(cont_nom,cont_prenom,cont_societe,cont_adresse1,cont_adresse2,cont_cp,cont_ville,cont_email,cont_tel,cont_tel2,cont_user_ID)
values
('Bertin', 'Alexandre', 'ContactFinder', '4 rue Paul Eluard', 'apt 62d', '33600', 'Pessac', 'mybrainisout@gmail.com', '0684052748','' , 1);


