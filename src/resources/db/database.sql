CREATE TABLE IF NOT EXISTS Categorias(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS Palabras(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(30),
  imagen VARCHAR(30),
  categoriaId INTEGER REFERENCES Categorias
);

CREATE TABLE IF NOT EXISTS Niveles(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nombre VARCHAR(30),
  grado INTEGER
);

CREATE TABLE IF NOT EXISTS PalabrasNivel(
  palabra INTEGER REFERENCES Palabras,
  nivel INTEGER REFERENCES  Niveles,
  PRIMARY KEY (palabra, nivel)
);