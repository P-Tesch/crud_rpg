CREATE TABLE sheets (
	"sheet_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "portrait" BYTEA NOT NULL,
    "description" VARCHAR NOT NULL,
    "background" VARCHAR NOT NULL,
    "creation_points" INTEGER NOT NULL,
    "alignment" VARCHAR,
    "organization" VARCHAR,
    "stats_id" INTEGER NOT NULL,
    "skills_id" INTEGER NOT NULL,
    "attributes_id" INTEGER NOT NULL,

    CONSTRAINT "fk_stats_id" FOREIGN KEY ("stats_id") REFERENCES "stats"("stats_id"),
    CONSTRAINT "fk_skills_id" FOREIGN KEY ("skills_id") REFERENCES "skills"("skills_id"),
    CONSTRAINT "fk_attributes_id" FOREIGN KEY ("attributes_id") REFERENCES "attributes"("attributes_id")
);