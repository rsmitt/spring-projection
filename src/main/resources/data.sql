/*insert into cars(name, number, year)
    values ('LADA', 'AA121212SD', 1990),
           ('BMW', 'XC323232BV', 2000);

*/

INSERT INTO category (id, name)
VALUES (1, 'mystery'),
       (2, 'romance'),
       (3, 'science'),
       (4, 'biography'),
       (5, 'fantasy');

INSERT INTO author (id, first_name, last_name, phone)
VALUES (1, 'John', 'Doe', '123-456-7890'),
       (2, 'Jane', 'Smith', '987-654-3210'),
       (3, 'David', 'Johnson', '555-555-5555'),
       (4, 'Sarah', 'Williams', '111-222-3333'),
       (5, 'Michael', 'Brown', '999-888-7777'),
       (6, 'Emily', 'Davis', '333-333-3333'),
       (7, 'Daniel', 'Wilson', '444-444-4444'),
       (8, 'Olivia', 'Anderson', '555-555-5555'),
       (9, 'William', 'Taylor', '666-666-6666'),
       (10, 'Sophia', 'Clark', '777-777-7777'),
       (11, 'James', 'Martin', '888-888-8888'),
       (12, 'Lily', 'Harris', '999-999-9999'),
       (13, 'Benjamin', 'Lee', '000-000-0000'),
       (14, 'Emma', 'Walker', '111-111-1111'),
       (15, 'Henry', 'Green', '222-222-2222');

INSERT INTO book (title, language, category_id, is_active)
VALUES ('The Mysterious Case of the Missing Necklace', 'English', 1, true),
       ('Love in the City of Lights', 'French', 2, false),
       ('The Quantum Paradox', 'German', 3, false),
       ('Unbreakable: A Life of Resilience', 'Spanish', 4, false),
       ('Realm of Dragons: The Epic Adventure Begins', 'English', 5, false);

INSERT INTO book_author (book_id, author_id)
VALUES (1, 1),
       (1, 2),

       (2, 1),
       (2, 3),
       (2, 4),

       (3, 2),
       (3, 4),
       (3, 5),

       (4, 3),
       (4, 5),
       (4, 6),

       (5, 1),
       (5, 4),
       (5, 6);

/*insert into CONTACT(country, city) values ('russia', 'moscow'), ('belarus', 'mink'), ('russia', 'omsk');*/