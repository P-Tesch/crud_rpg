CREATE TABLE attributes (
	"attributes_id" serial PRIMARY KEY,
    "health" INTEGER NOT NULL,
    "initiative" INTEGER NOT NULL,
    "movement" INTEGER NOT NULL,
    "mana" INTEGER,
    "energy" INTEGER,
    "blood" INTEGER,
    "blood_xp_human" INTEGER,
    "blood_xp_animal" INTEGER,
    "blood_xp_vampire" INTEGER,
    "working_circuits" INTEGER
);