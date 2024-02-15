CREATE TABLE spells (
	"spell_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "description" VARCHAR NOT NULL,
    "school_id" INTEGER NOT NULL,

    CONSTRAINT "fk_school_id" FOREIGN KEY ("school_id") REFERENCES "schools"("school_id")
);