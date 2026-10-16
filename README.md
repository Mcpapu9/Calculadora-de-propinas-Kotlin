# Tecnologías usadas
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Material Design 3](https://img.shields.io/badge/Material%20Design%203-757575?style=for-the-badge&logo=materialdesign&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

# Control de versiones
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

# 💰 Calculadora de Propinas — Android App

Una aplicación sencilla, limpia y funcional desarrollada para Android utilizando **Kotlin** y **Jetpack Compose**. Diseñada para calcular de forma rápida la propina y el total a pagar en un restaurante o cuenta rápida.

---

## 🚀 Características

* 📱 **Interfaz Moderna:** Diseñada 100% con Jetpack Compose y Material Design 3.
* ⚡ **Cálculo Instantáneo:** Selección de propinas rápidas (**10%**, **15%** y **20%**).
* 💵 **Desglose Claro:** Muestra el monto de la propina y el total general acumulado.
* ⌨️ **Entrada Optimizada:** Formulario enfocado para entrada numérica directa.

---

## 🛠️ Tecnologías y Herramientas

* **Lenguaje:** Kotlin
* **UI Framework:** Jetpack Compose
* **Componentes:** Material 3 (`Scaffold`, `OutlinedTextField`, `Button`, etc.)
* **Arquitectura:** Compose State Management (`remember`, `mutableStateOf`)
* **Mínimo SDK:** Android 7.0 (API 24+)

---

## 📂 Estructura del Proyecto

El proyecto sigue la estructura estándar de una aplicación moderna en Android con Jetpack Compose:

```text
Calculadora/

 app/                     # Módulo principal de la aplicación
    ├── build.gradle.kts     # Dependencias, SDKs y configs del módulo app
    └── src/
        ├── main/
        │   ├── AndroidManifest.xml          # Configuración y permisos de la app
        │   ├── java/
        │   │   └── com/example/calculadora/
        │   │       ├── MainActivity.kt      # Actividad principal y UI en Compose
        │   │       └── ui/
        │   │           └── theme/           # Diseño visual de la app
        │   │               ├── Color.kt     # Paleta de colores (ej. azul corporativo)
        │   │               ├── Theme.kt     # Tema Material 3 (Dark/Light mode)
        │   │               └── Type.kt      # Tipografías y estilos de texto
        │   │
        │   └── res/                         # Recursos estáticos de la app
        │       ├── drawable/                # Imágenes, vectores e iconos
        │       ├── mipmap/                  # Iconos de la aplicación para el launcher
        │       └── values/                  # Valores estáticos (strings, themes XML)
        │
        ├── androidTest/                     # Pruebas instrumentadas (UI tests en dispositivo)
        └── test/                            # Pruebas unitarias de lógica (JUnit)
```

---

## ⚙️ Configuración y Requisitos del Entorno

Para compilar y ejecutar este proyecto de manera exitosa en tu equipo, asegúrate de cumplir con los siguientes requisitos previos:

### Prerrequisitos
* **Android Studio:** Versión *Jellyfish*, *Koala* o superior recomendada.
* **JDK (Java Development Kit):** Versión 17 (incluida por defecto en Android Studio moderno).
* **SDK de Android:** 
  * **Compile SDK:** Android 34 (o superior)
  * **Minimum SDK:** API 24 (Android 7.0 Nougat)

### Pasos para clonar y configurar:

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/Mcpapu9/Calculadora-de-propinas-Kotlin.git](https://github.com/Mcpapu9/Calculadora-de-propinas-Kotlin.git)
   ```

2. **Abrir el proyecto:**

    Abre Android Studio y selecciona Open.

    Navega hasta la carpeta del repositorio clonado y selecciónala.

3. **Sincronización de Gradle:**

    Espera a que Android Studio detecte el archivo build.gradle.kts y sincronice las dependencias automáticamente. Si no inicia solo, haz clic en el botón de Sync Project with Gradle Files (icono del elefante con una flecha azul).

4. **Ejecutar en un Emulador o Dispositivo:**

    Crea un dispositivo virtual (AVD) con API 26 o superior desde el Device Manager, o conecta tu teléfono físico con la Depuración por USB activada.

    Haz clic en el botón Run ▶ (o presiona Shift + F10).
