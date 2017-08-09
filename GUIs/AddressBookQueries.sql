SELECT * FROM AddressBookEntries
SELECT firstname, lastname FROM AddressBookEntries

-- The following statement would only insert the
-- firstname and lastname values, this won't work
-- because my database won't allow nulls and
-- email and phoneNumber are empty
-- INSERT INTO AddressBookEntries 
-- (firstname, lastname) VALUES ('John', 'Smith')

INSERT INTO AddressBookEntries 
(id, firstname, lastname, email, phoneNumber)
VALUES (10, 'John', 'Smith', 'john@smith.ie', '0872223334')

INSERT INTO AddressBookEntries 
VALUES ('Mary', 'Smith', 'mary@smith.ie', '0868745632')

UPDATE AddressBookEntries SET firstname = 'Ted', lastname = 'Reddy', email = 'ted@reddy.com', phoneNumber = '124567' WHERE id = 10

UPDATE AddressBookEntries 
SET firstname = 'John'
WHERE id = 4

if exists(SELECT firstname FROM AddressBookEntries
WHERE firstname = 'John')
DELETE FROM AddressBookEntries
WHERE id = 5

DELETE FROM AddressBookEntries WHERE id = 3

DELETE FROM AddressBookEntries
WHERE id BETWEEN 4 AND 10

-- When the table is empty, you call Truncate, it will keep
-- the table structure, but delete everything and reset
-- the identity seed to 1 for the auto numbering for the id.
TRUNCATE TABLE AddressBookEntries

-- Another way to reset the Auto number
SET IDENTITY_INSERT AddressBookEntries ON   -- Off
SET IDENTITY_INSERT AddressBookEntries OFF  -- On