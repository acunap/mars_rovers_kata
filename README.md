# Mars rover kata

## Description
Develop an API that moves a rover around a grid.

The starting point of the rover is `X = 0` and `Y = 0` and the direction is `N`. The API should accept a string with
commands and process them following the requirements.

Try to follow the requirements as they come, don't read the next until you finish with current one.

## Requirements
1. When the rover receives the command `L`, it should rotate to the left. Examples:
   - `0.0.N` receives `L`, it should return `0.0.W`.
   - `0.0.N` receives `LL`, it should return `0.0.S`.
2. When the rove receives the command `R`, it should rotate to the right. Examples:
   - `0.0.N` receives `R`, it should return `0.0.E`.
   - `0.0.N` receives `RR`, it should return `0.0.S`.
3. When the rover receives the command `M`, it should move one position forwards. Examples:
   - `0.0.N` receives `M`, it should return `0.1.N`.
   - `0.0.N` receives `MM`, it should return `0.2.N`.
4. When the rover receives the command `B`, it should move one position backwards. Examples:
    - `0.2.N` receives `B`, it should return `0.1.N`.
    - `0.2.N` receives `BB`, it should return `0.0.N`.
5. The grid is a 10x10 grid and the rover can't move to a negative position. If that happens, the rover moves to the
other side of the row/column. Examples:
    - `0.0.N` receives `B`, it should return `0.9.N`.
    - `0.0.N` received `BB`, it should return `0.8.N`.

## Full example

The rover is in the starting point `0.0.N` and receives `BBRMMLM`:
- `B` moves to `0.9.N`.
- `B` moves to `0.8.N`.
- `R` rotates to `0.8.E`.
- `M` moves to `1.8.E`.
- `M` moves to `2.8.E`.
- `L` moves to `2.8.N`.
- `M` moves to `2.9.N`.
