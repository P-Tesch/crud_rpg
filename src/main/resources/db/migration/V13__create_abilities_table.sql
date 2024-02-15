CREATE TABLE abilities (
	"ability_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "description" VARCHAR NOT NULL,
    "level" INTEGER NOT NULL,
    "sonata_id" INTEGER NOT NULL,

    CONSTRAINT "fk_sonata_id" FOREIGN KEY ("sonata_id") REFERENCES "sonatas"("sonata_id")
);