@Composable
fun ComposeBasicsModule() {
    // 1. Estado: Para demostrar interactividad
    var counter by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // 2. Texto con Estilo
        Text(
            text = "Módulo: Conceptos Básicos",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        // 3. Un componente Card (Contenedor)
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Aprendiendo Compose", fontWeight = FontWeight.Bold)
                Text("Este módulo cubre layouts, estados y componentes.")
            }
        }

        // 4. Interacción (Botón y Estado)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = { counter++ }) {
                Text("Incrementar")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text("Clicks: $counter", fontSize = 20.sp)
        }

        // 5. Imagen o Icono
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = null,
            tint = Color.Red,
            modifier = Modifier.size(50.dp)
        )
    }
}