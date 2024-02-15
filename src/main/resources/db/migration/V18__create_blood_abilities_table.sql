CREATE TABLE blood_abilities (
	"blood_ability_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "description" VARCHAR NOT NULL,
    "blood_id" INTEGER NOT NULL,

    CONSTRAINT "fk_blood_id" FOREIGN KEY ("blood_id") REFERENCES "bloods"("blood_id")
);