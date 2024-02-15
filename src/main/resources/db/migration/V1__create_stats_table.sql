CREATE TABLE stats (
	"stats_id" serial PRIMARY KEY,
    "strength" INTEGER NOT NULL,
	"dexterity" INTEGER NOT NULL,
    "agility" INTEGER NOT NULL,
    "endurance" INTEGER NOT NULL,
    "charisma" INTEGER NOT NULL,
    "perception" INTEGER NOT NULL,
    "inteligence" INTEGER NOT NULL,
    "class" INTEGER NOT NULL
);