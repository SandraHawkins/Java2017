SELECT * FROM AddressBookEntries
SELECT firstname, lastname FROM AddressBookEntries

-- The following statement would only insert the
-- firstname and lastname values, this won't work
-- because my database won't allow nulls and
-- email and phoneNumber are empty
-- INSERT INTO AddressBookEntries 
-- (firstname, lastname) VALUES ('John', 'Smith')

INSERT INTO AddressBookEntries 
VALUES ('John', 'Smith', 'john@smith.ie', '0872223334')

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