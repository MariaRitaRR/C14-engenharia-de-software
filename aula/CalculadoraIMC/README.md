# Calculadora de IMC

Projeto desenvolvido em **Java** utilizando **Maven** para gerenciamento de dependências.  
O programa calcula o **Índice de Massa Corporal (IMC)** a partir do peso e altura do usuário e fornece a classificação de acordo com o resultado.

---

## 📋 Descrição do Projeto
A **Calculadora de IMC** solicita ao usuário os valores de **peso (kg)** e **altura (m)**, realiza o cálculo:

IMC = peso / (altura * altura)


E classifica o resultado em:
- Abaixo do peso
- Peso normal
- Sobrepeso
- Obesidade

Além disso, utiliza **SLF4J** para geração de logs informativos, de aviso e de erro.

---

## ⚙️ Tecnologias Utilizadas
- **Java 17** (ou versão compatível)
- **Maven** (para gerenciamento de dependências e build)
- **SLF4J** (para logging)

---

## 📦 Estrutura do Projeto

ExercicioAula3Dependencias
├── src
│ └── main
│ └── java
│ └── org.example
│ └── CalculadoraIMC.java
├── target
│ └── ExercicioAula3Dependencias-1.0-SNAPSHOT.jar
├── pom.xml
└── README.md


---

## 🛠️ Configuração do Ambiente
1. Certifique-se de ter o **Java (JDK 17+)** instalado:
   java -version

2. Certifique-se de ter o **Maven** instalado:
    mvn -version

## 📥 Instalação e Dependências
1. **Clone o Repositório**
    git clone https://github.com/MariaRitaRR/C14-engenharia-de-software

2. **Abra a Pasta**
    cd ExercicioAula3Dependencias

3. **Instale as Dependências**
    mvn clean install




=== Calculadora de IMC ===
Digite o seu peso (kg): 70
Digite a sua altura (m): 1.75

Seu IMC é: 22.857142857142858
Classificação: Peso normal



