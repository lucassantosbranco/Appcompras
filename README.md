# 🛒 App Compras

Um aplicativo Android simples e intuitivo para gerenciar listas de compras, permitindo selecionar produtos e calcular automaticamente o valor total da compra através de checkboxes interativas.

---

## 🎯 Objetivo do Aplicativo

Desenvolver uma aplicação Android que simula um carrinho de compras básico, onde o usuário pode selecionar produtos desejados e visualizar o custo total de sua compra de forma imediata e clara.

---

## ✨ Funcionalidades Principais

- ✅ **Seleção de Produtos** - Marca/desmarca produtos usando CheckBox
- ✅ **Cálculo Automático** - Totalizador de preços em tempo real
- ✅ **Diálogo de Confirmação** - Exibe valor total em AlertDialog
- ✅ **Lista de Produtos Pré-definida** - Cinco itens com preços fixos
- ✅ **Interface Simples** - Design intuitivo e fácil de usar
- ✅ **Validação de Seleção** - Apenas produtos marcados são contabilizados

---

## 📦 Produtos Disponíveis

| Produto | Preço | ID do CheckBox |
|---------|-------|--------|
| 🍚 Arroz | R$ 2,69 | `chkarroz` |
| 🥛 Leite | R$ 5,00 | `chkleite` |
| 🥩 Carne | R$ 9,70 | `chkcarne` |
| 🫘 Feijão | R$ 2,30 | `chkfeijao` |
| 🥤 Refrigerante Coca-Cola | R$ 2,00 | `chkrefrigerante` |

---

## 🏗️ Estrutura da Interface

### Layout Visual

```
┌─────────────────────────────────────┐
│    CARRINHO DE COMPRAS              │
├─────────────────────────────────────┤
│                                     │
│  ☐ Arroz ........................   │
│  ☐ Leite ........................   │
│  ☐ Carne ........................   │
│  ☐ Feijão .......................   │
│  ☐ Refrigerante Coca-Cola .......   │
│                                     │
│         [CALCULAR TOTAL]            │
│                                     │
└─────────────────────────────────────┘
```

### Componentes da Interface

| Componente | Tipo | Descrição | ID |
|-----------|------|-----------|-----|
| Título | TextView | "Carrinho de Compras" | `tvTitulo` |
| Arroz | CheckBox | Seleção de arroz | `chkarroz` |
| Leite | CheckBox | Seleção de leite | `chkleite` |
| Carne | CheckBox | Seleção de carne | `chkcarne` |
| Feijão | CheckBox | Seleção de feijão | `chkfeijao` |
| Refrigerante | CheckBox | Seleção de refrigerante | `chkrefrigerante` |
| Botão | Button | Calcular total | `bttotal` |

---

## 💡 Como Funciona

### 1. Seleção de Produtos

O usuário marca os CheckBox dos produtos que deseja comprar:

```java
// Verificar se o arroz foi selecionado
if (chkarroz.isChecked()) { 
    total += 2.69; 
}
```

**Cada CheckBox marcado:**
- Adiciona o preço correspondente ao total
- Pode ser desmarcado para remover da compra

### 2. Cálculo do Total

Ao clicar no botão "Calcular Total", o aplicativo:

```java
double total = 0;

if (chkarroz.isChecked()) { total += 2.69; }
if (chkleite.isChecked()) { total += 5.00; }
if (chkcarne.isChecked()) { total += 9.70; }
if (chkfeijao.isChecked()) { total += 2.30; }
if (chkrefrigerante.isChecked()) { total += 2.00; }
```

1. Inicializa o total como zero
2. Verifica cada CheckBox
3. Se marcado, adiciona o preço ao total
4. Se desmarcado, não adiciona nada

### 3. Exibição do Resultado

Um `AlertDialog` mostra o valor final:

```java
AlertDialog.Builder dialogo = new AlertDialog.Builder(ComprasActivity.this);
dialogo.setTitle("Aviso");
dialogo.setMessage("Valor total da compra: R$ " + String.valueOf(total));
dialogo.setNeutralButton("OK", null);
dialogo.show();
```

**Resultado:**
- Um diálogo aparece na tela
- Exibe o título "Aviso"
- Mostra a mensagem com o total em R$
- Botão OK para fechar

---

## 🛠️ Tecnologias e Ferramentas

Para o desenvolvimento deste projeto, foram utilizadas:

- **Linguagem:** [Java](https://www.java.com/pt-BR/)
- **Layout:** XML (LinearLayout ou ConstraintLayout)
- **IDE:** [Android Studio](https://developer.android.com/studio)
- **Gerenciador de Dependências:** Gradle
- **API Mínima:** Android 4.0 (API 14)

---

## 📋 Requisitos do Projeto

### Configurações Iniciais

| Configuração | Valor |
|-------------|-------|
| Project Name | App Compras |
| Package Name | br.ulbra.appcompras |
| Linguagem | Java |
| Minimum SDK | API 14 (Android 4.0) |
| Activity Name | ComprasActivity |
| Layout Name | activity_compras |

---

## 📁 Estrutura do Projeto

```
AppCompras/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── br/ulbra/appcompras/
│   │   │   │       └── ComprasActivity.java
│   │   │   └── res/
│   │   │       └── layout/
│   │   │           └── activity_compras.xml
│   └── build.gradle
└── README.md
```

---

## 📝 Código Completo

### activity_compras.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <TextView
        android:id="@+id/tvTitulo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Carrinho de Compras"
        android:textSize="24sp"
        android:textStyle="bold"
        android:layout_marginBottom="32dp" />

    <CheckBox
        android:id="@+id/chkarroz"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Arroz - R$ 2,69"
        android:layout_marginBottom="12dp" />

    <CheckBox
        android:id="@+id/chkleite"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Leite - R$ 5,00"
        android:layout_marginBottom="12dp" />

    <CheckBox
        android:id="@+id/chkcarne"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Carne - R$ 9,70"
        android:layout_marginBottom="12dp" />

    <CheckBox
        android:id="@+id/chkfeijao"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Feijão - R$ 2,30"
        android:layout_marginBottom="12dp" />

    <CheckBox
        android:id="@+id/chkrefrigerante"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Refrigerante Coca-Cola - R$ 2,00"
        android:layout_marginBottom="32dp" />

    <Button
        android:id="@+id/bttotal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Calcular Total"
        android:padding="16dp" />

</LinearLayout>
```

### ComprasActivity.java

```java
package br.ulbra.appcompras;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ComprasActivity extends Activity {
    
    CheckBox chkarroz, chkleite, chkcarne, chkfeijao, chkrefrigerante;
    Button bttotal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

        // Vinculando os CheckBox
        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkleite = (CheckBox) findViewById(R.id.chkleite);
        chkcarne = (CheckBox) findViewById(R.id.chkcarne);
        chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
        chkrefrigerante = (CheckBox) findViewById(R.id.chkrefrigerante);

        // Vinculando o Botão
        bttotal = (Button) findViewById(R.id.bttotal);

        // Implementando o evento de clique
        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;

                // Verificando e somando os valores
                if (chkarroz.isChecked()) { 
                    total += 2.69; 
                }
                if (chkleite.isChecked()) { 
                    total += 5.00; 
                }
                if (chkcarne.isChecked()) { 
                    total += 9.70; 
                }
                if (chkfeijao.isChecked()) { 
                    total += 2.30; 
                }
                if (chkrefrigerante.isChecked()) { 
                    total += 2.00; 
                }

                // Exibindo o resultado
                AlertDialog.Builder dialogo = new AlertDialog.Builder(ComprasActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra: R$ " + String.format("%.2f", total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}
```

---

## 📚 Conceitos Principais

### CheckBox

Widget que permite ao usuário selecionar/desselecionar opções:

```java
CheckBox chkarroz = (CheckBox) findViewById(R.id.chkarroz);
if (chkarroz.isChecked()) {
    // Checkbox está marcado
}
```

**Métodos úteis:**
- `isChecked()` - Verifica se está marcado
- `setChecked(boolean)` - Define o estado
- `toggle()` - Inverte o estado

### AlertDialog

Diálogo para exibir mensagens ao usuário:

```java
AlertDialog.Builder dialogo = new AlertDialog.Builder(contexto);
dialogo.setTitle("Título");
dialogo.setMessage("Mensagem");
dialogo.setNeutralButton("OK", null);
dialogo.show();
```

**Componentes:**
- `setTitle()` - Título do diálogo
- `setMessage()` - Mensagem exibida
- `setNeutralButton()` - Botão neutro (OK)
- `show()` - Exibe o diálogo

### Acumular Valores

Padrão comum em aplicações de cálculo:

```java
double total = 0;

if (condicao1) total += valor1;
if (condicao2) total += valor2;
if (condicao3) total += valor3;
```

---

## 💡 Conceitos Aprendidos

Durante o desenvolvimento desta aplicação, aprendemos:

1. **CheckBox** - Componente de seleção múltipla
2. **AlertDialog** - Diálogos de informação
3. **Eventos de Clique** - Manipulação de clicks em botões
4. **Cálculo de Totais** - Acumulação de valores
5. **Verificação de Estados** - Usar `isChecked()`
6. **Formatting de Valores** - Formatação de moeda
7. **findViewById()** - Ligação de componentes
8. **onCreate()** - Método de inicialização
9. **Operadores Aritméticos** - Soma de valores

---

## 🚀 Como Executar

1. **Abra o Android Studio**
2. **Crie um novo projeto** chamado "App Compras"
3. **Crie a ComprasActivity** manualmente
4. **Copie o layout XML** para `activity_compras.xml`
5. **Copie o código Java** para `ComprasActivity.java`
6. **Compile o projeto** - Build > Rebuild Project
7. **Execute no emulador** - Run > Run 'app'
8. **Teste a funcionalidade:**
   - Marque alguns CheckBox
   - Clique em "Calcular Total"
   - Verifique o valor exibido no diálogo

---

## ✅ Resultado Final

O aplicativo apresentará:

✅ Lista de 5 produtos com preços  
✅ CheckBox para cada produto  
✅ Botão para calcular total  
✅ AlertDialog com valor final em R$  
✅ Interface simples e intuitiva  

---

## 🎓 Exemplos de Uso

### Exemplo 1: Comprar Arroz e Leite
```
Arroz ☑ (R$ 2,69)
Leite ☑ (R$ 5,00)
Carne ☐
Feijão ☐
Refrigerante ☐

Total: R$ 7,69
```

### Exemplo 2: Comprar Tudo
```
Arroz ☑ (R$ 2,69)
Leite ☑ (R$ 5,00)
Carne ☑ (R$ 9,70)
Feijão ☑ (R$ 2,30)
Refrigerante ☑ (R$ 2,00)

Total: R$ 21,69
```

### Exemplo 3: Sem Produtos
```
Arroz ☐
Leite ☐
Carne ☐
Feijão ☐
Refrigerante ☐

Total: R$ 0,00
```

---

## 🔧 Melhorias Futuras

- 🎨 Adicionar ícones dos produtos
- 💾 Salvar histórico de compras
- 🏪 Adicionar mais produtos
- 📊 Mostrar gráfico de gastos
- 💳 Integrar com sistema de pagamento
- 🛍️ Adicionar quantidade de produtos
- 🔧 Permitir edição de preços
- 📱 Versão melhorada com Material Design

---

## 🔍 Diferenças entre Versões de Android

### API 14 vs API 21+

Este projeto foi desenvolvido para API 14 (Android 4.0) por ser simples.

**Para versões mais modernas (API 21+), considere:**
- Usar `AppCompatActivity` em vez de `Activity`
- Implementar Material Design
- Usar `ConstraintLayout` em vez de `LinearLayout`

---

## ⚠️ Possíveis Erros e Soluções

### Erro: "cannot find symbol R"
- **Causa:** Projeto não foi sincronizado
- **Solução:** File > Sync Now

### Erro: "Activity not found"
- **Causa:** Activity não registrada no AndroidManifest.xml
- **Solução:** Verificar se a Activity está no manifesto

### Erro: "NullPointerException"
- **Causa:** findViewById() retornou null
- **Solução:** Verificar se o ID no XML corresponde ao Java

---

## 👨‍💻 Autor

Desenvolvido como atividade de aprendizado em Android com Java.

---

## 📝 Licença

Este projeto é fornecido como material educacional.

---

## 🤝 Contribuições

Sugestões e melhorias são bem-vindas!
