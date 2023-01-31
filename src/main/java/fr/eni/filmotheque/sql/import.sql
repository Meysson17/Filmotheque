insert into genre (libelle)
VALUES ("Horreur");
insert into genre (libelle)
VALUES ("Comedie");
insert into genre (libelle)
VALUES ("Animation");
insert into genre (libelle)
VALUES ("Romantique");
insert into genre (libelle)
VALUES ("Action");

INSERT INTO films (annee_sortie, duree, synopsis, titre, genre_id)
VALUES (2022, 120, "extrait de la mort", "La tombe", 1);
INSERT INTO films (annee_sortie, duree, synopsis, titre, genre_id)
VALUES (2025, 90, "Axterix est amoureux", "Axterix et obelix: mission cleopatre", 2);
INSERT INTO films (annee_sortie, duree, synopsis, titre, genre_id)
VALUES (2022, 120, "Ultron veut conquérir le monde", "Avengers; l'ere d'ultron", 5);
INSERT INTO films (annee_sortie, duree, synopsis, titre, genre_id)
VALUES (2022, 120, "Rasengan", "Naruto", 3);
INSERT INTO films (annee_sortie, duree, synopsis, titre, genre_id)
VALUES (2022, 120, "Grey est un vampire qui est amoureux d'une humaine", "Twilight", 4);

INSERT INTO participant (nom, prenom)
VALUES ("Obe", "lix");
INSERT INTO participant (nom, prenom)
VALUES ("lavo", "ione");
INSERT INTO participant (nom, prenom)
VALUES ("lion", "guépard");
INSERT INTO participant (nom, prenom)
VALUES ("Jean", "michel");
INSERT INTO participant (nom, prenom)
VALUES ("gigi", "leopard");
INSERT INTO participant (nom, prenom)
VALUES ("taurus", "lucy");

insert into acteurs_film (film_id, acteurparticipant_id)
values (1, 1);
insert into acteurs_film (film_id, acteurparticipant_id)
values (2, 1);
insert into acteurs_film (film_id, acteurparticipant_id)
values (3, 1);
insert into acteurs_film (film_id, acteurparticipant_id)
values (4, 1);
insert into acteurs_film (film_id, acteurparticipant_id)
values (1, 3);
insert into acteurs_film (film_id, acteurparticipant_id)
values (2, 2);
insert into acteurs_film (film_id, acteurparticipant_id)
values (5, 6);

INSERT INTO realisateur_film (realisateur_id, film_id)
VALUES (1, 2);
INSERT INTO realisateur_film (realisateur_id, film_id)
VALUES (3, 1);
INSERT INTO realisateur_film (realisateur_id, film_id)
VALUES (4, 3);
INSERT INTO realisateur_film (realisateur_id, film_id)
VALUES (6, 5);
INSERT INTO realisateur_film (realisateur_id, film_id)
VALUES (2, 4);


insert into avis (commentaire, note, film_id)
VALUES ("bien", 5, 1);
insert into avis (commentaire, note, film_id)
VALUES ("mauvais", 1, 1);
insert into avis (commentaire, note, film_id)
VALUES ("moyen", 3, 2);
insert into avis (commentaire, note, film_id)
VALUES ("nickel", 5, 3);
insert into avis (commentaire, note, film_id)
VALUES ("daube", 1, 2);
insert into avis (commentaire, note, film_id)
VALUES ("passable", 3, 4);
insert into avis (commentaire, note, film_id)
VALUES ("peu mieux faire", 2, 5);
