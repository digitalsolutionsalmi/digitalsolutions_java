<div align="left">
    <img src="https://raw.githubusercontent.com/digitalsolutionsalmi/digitalsolutions_java/refs/heads/main/DigitalSolutions_logo.png" width="40%" align="left" style="margin-right: 15px"/>
    <div style="display: inline-block;">
        <h2 style="display: inline-block; vertical-align: middle; margin-top: 0;">DIGITALSOLUTIONS ALMINGO</h2>
        <p>
	<img src="https://img.shields.io/github/license/digitalsolutionsalmi/digitalsolutions_java?style=flat-square&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/languages/top/digitalsolutionsalmi/digitalsolutions_java?style=flat-square&color=0080ff" alt="repo-top-language">
</p>
        <p>Construido con la herramienta y tecnología:</p>
        <p>
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat-square&logo=openjdk&logoColor=white" alt="java">
</p>
    </div>
</div>
<br clear="left"/>

<details><summary>Índice</summary>

- [📍 Descripción](#📍-descripción)
- [📌 Características](#📌-características)
- [🚀 Cómo Jugar](#🚀-cómo-jugar)
  - [🧪 Requisitos](#🧪-requisitos)
  - [🤖 Para el Anfitrión](#🤖-para-el-anfitrión)
  - [👾 Para los Jugadores](#👾-para-los-jugadores)
- [📂 Detalles Técnicos](#📂-detalles-técnicos)
- [🔰 Directrices para contribuir](#🔰-directrices-para-contribuir)
- [🎗 Información sobre la licencia](#🎗-información-sobre-la-licencia)
- [🙌 Agradecimientos](#🙌-agradecimientos)

</details>
<hr>

## 📍 Descripción

ALMINGO es un juego de bingo multijugador desarrollado en Java con una interfaz gráfica de usuario (GUI) hecha con Swing. El juego combina la emoción del bingo tradicional con un toque educativo, ya que los jugadores deben responder preguntas de trivia para marcar las líneas en sus cartones.

El juego está diseñado para ser jugado en una red local, donde un jugador actúa como "Anfitrión" y los demás se unen como jugadores.

---

## 📌 Características

- **Modo Anfitrión:** Inicia y gestiona la partida, saca los números y los muestra en un panel.
- **Modo Jugador:** Se une a una partida existente, recibe un cartón de bingo virtual y juega.
- **Bingo Interactivo:** Los jugadores marcan los números en sus cartones haciendo clic en ellos.
- **Trivia Educativa:** Al completar una línea, el jugador debe responder correctamente a una pregunta de trivia para validarla. Las preguntas están relacionadas con la sostenibilidad y la tecnología.
- **Comunicación en Red:** El juego utiliza archivos compartidos en una red local para sincronizar el estado de la partida y los números sacados.

---

## 🚀 Cómo Jugar

### 🧪 Requisitos

- Tener Java instalado en todos los equipos.
- Estar conectado a la misma red local.
- Tener una carpeta compartida en la red accesible para todos los jugadores. La ruta de la carpeta compartida está configurada en el código como `\\192.168.0.28\almingo\`.

### 🤖 Para el Anfitrión

1.  Ejecuta la aplicación y haz clic en **"CREAR PARTIDA"**.
2.  Se abrirá la ventana del Anfitrión, que mostrará un panel con todos los números del 1 al 90.
3.  Haz clic en el botón con el GIF animado para sacar un nuevo número.
4.  El número sacado se marcará en el panel y se registrará en un archivo de red para que los jugadores puedan comprobarlo.
5.  La partida continúa hasta que un jugador cante "¡BINGO!".

### 👾 Para los Jugadores

1.  Ejecuta la aplicación.
2.  Introduce un nombre de usuario y haz clic en **"UNIRSE A LA PARTIDA"**.
3.  Se generará un cartón de bingo único para ti.
4.  A medida que el Anfitrión saque números, haz clic en los números correspondientes en tu cartón para marcarlos.
5.  Cuando completes una línea horizontal, el juego te presentará una pregunta de trivia.
6.  Si respondes correctamente, la línea se marcará como válida (en verde). Si fallas, se marcará como inválida (en rojo).
7.  Gana el primer jugador que complete las tres líneas de su cartón y responda correctamente a las tres preguntas de trivia.

---

## 📂 Detalles Técnicos

El proyecto se compone de tres clases principales:

- **`Inicio.java`:** La ventana de inicio donde los usuarios pueden elegir entre crear o unirse a una partida.
- **`Anfitrion.java`:** Gestiona la lógica del anfitrión, incluyendo la generación de números y la actualización del estado de la partida en la red.
- **`Carton.java`:** Representa el cartón del jugador. Gestiona la interacción del jugador, la comprobación de números, la validación de líneas y la presentación de las preguntas de trivia.

La comunicación entre el anfitrión y los jugadores se realiza mediante la lectura y escritura de dos archivos de texto en una carpeta de red compartida:

- **`comprobarestado.txt`:** Indica si una partida está en curso.
- **`comprobarnumeros.txt`:** Almacena la lista de números que ya han salido.

Las preguntas de trivia se cargan desde el archivo `settings$/preguntas.txt`, donde la respuesta correcta es marcada con un guion delante.

---

## 🔰 Directrices para contribuir

¡Aceptamos contribuciones! Para contribuir:

1.  **Haz un Fork del Repositorio:** Crea tu propio fork del repositorio.
2.  **Crea una Rama:** Crea una nueva rama para tu nueva característica o corrección de errores.
3.  **Realiza Cambios:** Implementa tus cambios y asegúrate de que estén bien probados.
4.  **Confirma los Cambios:** Confirma tus cambios con mensajes de confirmación descriptivos.
5.  **Crea una Pull Request:** Envía una pull request al repositorio principal.

Por favor, asegúrate de que tu código se adhiera al estilo de codificación del proyecto e incluya la documentación apropiada.

---

## 🎗 Información sobre la licencia

Este proyecto está licenciado bajo la [Boost Software License 1.0](https://www.boost.org/LICENSE_1_0.txt).

```
Boost Software License - Version 1.0 - August 17th, 2003

Permission is hereby granted, free of charge, to any person or organization
obtaining a copy of the software and accompanying documentation covered by
this license (the "Software") to use, reproduce, display, distribute,
execute, and transmit the Software, and to prepare derivative works of the
Software, and to permit third-parties to whom the Software is furnished to
do so, all subject to the following:

The copyright notices in the Software and this entire statement, including
the above license grant, this restriction and the following disclaimer,
must be included in all copies of the Software, in whole or in part, and
all derivative works of the Software, unless such copies or derivative
works are solely in the form of machine-executable object code generated by
a source language processor.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE, TITLE AND NON-INFRINGEMENT. IN NO EVENT
SHALL THE COPYRIGHT HOLDERS OR ANYONE DISTRIBUTING THE SOFTWARE BE LIABLE
FOR ANY DAMAGES OR OTHER LIABILITY, WHETHER IN CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
DEALINGS IN THE SOFTWARE.
```

---

## 🙌 Agradecimientos

- A nuestro profesor Roberto, por su guía y apoyo en el aprendizaje de informática.
