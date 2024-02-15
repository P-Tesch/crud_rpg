CREATE TABLE bloods (
	"blood_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "impulses" VARCHAR NOT NULL,
    "sheet_id" INTEGER NOT NULL,
    "stats_id" INTEGER NOT NULL,

    CONSTRAINT "fk_sheet_id" FOREIGN KEY ("sheet_id") REFERENCES "sheets"("sheet_id"),
    CONSTRAINT "fk_stats_id" FOREIGN KEY ("stats_id") REFERENCES "stats"("stats_id")
);