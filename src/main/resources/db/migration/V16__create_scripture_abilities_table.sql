CREATE TABLE scripture_abilities (
	"scripture_ability_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "description" VARCHAR NOT NULL,
    "level" INTEGER NOT NULL,
    "scripture_id" INTEGER NOT NULL,

    CONSTRAINT "fk_scripture_id" FOREIGN KEY ("scripture_id") REFERENCES "scriptures"("scripture_id")
);