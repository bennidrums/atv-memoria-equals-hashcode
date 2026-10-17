# M21 — Memória, equals() e hashCode()

Atividade prática do curso **EBAC Back-end Java v2** sobre igualdade lógica entre objetos e o comportamento de conjuntos no Java.

## O que o programa faz

Cria objetos `Pessoa` e os adiciona a um `HashSet`. Duas pessoas são criadas com o mesmo nome e a mesma idade; o conjunto evita manter as duas como elementos distintos porque a classe define esses atributos como critério de igualdade.

## Conceitos praticados

- Classe `Pessoa` com atributos privados e construtor.
- Sobrescrita de `equals(Object)`.
- Sobrescrita de `hashCode()` usando `Objects.hash()`.
- Contrato entre `equals()` e `hashCode()`.
- Coleção `HashSet`, que não mantém elementos duplicados segundo a igualdade definida pela classe.
- Percorrer uma coleção com `for-each`.

## Como executar

Abra o projeto no IntelliJ IDEA e execute `src/MemoriaMain.java).

## Resultado esperado

O conjunto termina com três pessoas, pois as duas instâncias de João, de 25 anos, são consideradas iguais pela implementação de `Pessoa`.

---

**Curso:** EBAC — Back-end Java v2  
**Tema:** igualdade de objetos e coleções
