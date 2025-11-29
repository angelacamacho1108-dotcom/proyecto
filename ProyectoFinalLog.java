package proyecto;

import java.util.Scanner;

public class ProyectoFinalLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        final int CONTRASEÑA =2;
        final String NOMBREADMIN = "A";
        String numeroFactura="";
        int contraseñaAdmin;
        int contraseñaCliente;
        String usuarioAdmin;
        String usuarioclienteacc;
        int indiceProductos=0;
        int indiceVentas=0;
        int indiceClientes=0;
        int indiceUsuarioClientes=0;
        int tamaño=10;
        int respuesta;
        String nombre;
        //arreglos clientes
        String [] tipoDocumento=new String[tamaño];
        String [] numeroDocumento=new String[tamaño];
        String [] nombreCliente=new String[tamaño];
        String [] direccionEntrega=new String[tamaño];
        String [] celular=new String[tamaño];
        String [] email=new String[tamaño];

        //arreglos para productos
        String [] codigoProducto=new String[tamaño];
        String [] nombreProducto=new String[tamaño];
        String [] tallaProducto=new String[tamaño];;
        String [] colorProduto=new String[tamaño];
        int [] cantidadProducto=new int[tamaño];
        double[] precioProducto=new double[tamaño];

        //arreglos ventas

        String [] numFactura=new String[tamaño];
        String [] fecha =new String[tamaño];
        String [] formaPagoID=new String[tamaño];
        String [] clienteVenta=new String[tamaño];
        String [] productoVenta=new String[tamaño];
        int [] cantidadVenta=new int[tamaño];
        double[] totalVenta=new double[tamaño];
        //arreglos clientes
        String[] usuarioCliente = new String[tamaño];
        int[] claveCliente = new int[tamaño];

        System.out.println("=======================Bienvenido al sistema de Fit Street Shop=======================\n");
        do {
            System.out.println("""
                    =======================MENÚ PRINCIPAL==============================
                    Por favor seleccionar una de las siguientes opciones:
                        1. Si eres Administrador
                        2. Si eres Cliente
                        3. Salir
                    """);
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresar Nombre de usuario Administrador");
                    usuarioAdmin = sc.nextLine();
                    System.out.println("Ingresar contraseña");
                    contraseñaAdmin=sc.nextInt();
                    if (usuarioAdmin.equals(NOMBREADMIN) && contraseñaAdmin==CONTRASEÑA){
                       do {
                           System.out.println("""
                                   =======================MENÚ ADMINISTRADOR==============================
                                   Por favor seleccionar una de las siguientes opciones:
                                       1. Para gestionar Clientes
                                       2. Para gestionar Productos
                                       3. Para Gestionar Ventas
                                       4. Salir
                                   """);
                           opcion = sc.nextInt();
                           sc.nextLine();
                           switch (opcion){
                               case 1-> {
                                   do {
                                       System.out.println("""
                                            =======================GESTIÓN DE CLIENTES==============================
                                            Por favor seleccionar una de las siguientes opciones:
                                                1. Para crear clientes
                                                2. Para ver clientes
                                                3. Para actualizar cliente
                                                4. Para eliminar cliente
                                                5. Regresar al menú anterior
                                            """);
                                       opcion = sc.nextInt();
                                       sc.nextLine();
                                       switch (opcion) {
                                           case 1 -> {
                                              do {
                                                  System.out.println("=======================Ingresar información del cliente==============================");
                                                  System.out.println("Ingresar nombre cliente");
                                                  nombreCliente[indiceClientes]= sc.nextLine();
                                                  System.out.println("Ingresar tipo de documento");
                                                  tipoDocumento[indiceClientes]= sc.nextLine();
                                                  System.out.println("Ingresar numero de identificación");
                                                  numeroDocumento[indiceClientes]= sc.nextLine();
                                                  System.out.println("Ingresar Dirección de entrega");
                                                  direccionEntrega[indiceClientes]= sc.nextLine();
                                                  System.out.println("Ingresar numero de celular");
                                                  celular[indiceClientes]= sc.nextLine();
                                                  System.out.println("Ingresar correo electronico");
                                                  email[indiceClientes]= sc.nextLine();
                                                  indiceClientes++;
                                                  System.out.println("""
                                                          Deseas ingresar a otro cliente
                                                          1. para Si
                                                          2. Para No""");
                                                  respuesta= sc.nextInt();
                                              }while (respuesta==1 && indiceClientes<tamaño);

                                           }
                                           case 2 ->{
                                               System.out.println("    Nombres Cliente |   Tipo de dcumento  |   Numero de identificación   |   Direccion entrega   |   Numero de celular |   Correo electronico");
                                               for(int p=0;p<indiceClientes;p++){
                                                   System.out.println(nombreCliente[p]+" |   "+tipoDocumento[p]+"    |   "+numeroDocumento[p]+"   |   "+direccionEntrega[p]+"  |   "+celular[p]+"   |   "+email[p]);}
                                           }
                                           case 3->{
                                                do {
                                                    System.out.println("""
                                                       Por favor seleccionar una de las siguientes opciones:
                                                       1. Para actualizar dirección del cliente
                                                       2. Para actualizar numero de celular del cliente
                                                       3. Para actualizar correo electronico
                                                       4. Regresar al menú anterior""");
                                                    opcion=sc.nextInt();
                                                    sc.nextLine();
                                                    switch (opcion){
                                                        case 1->{
                                                            System.out.println("Ingresar el nombre del cliente a actualizar");
                                                            nombre=sc.nextLine();
                                                            for(int y=0;y<nombreCliente.length;y++){
                                                                if(nombre.equals(nombreCliente[y])){System.out.println("Ingresar la nueva dirección del cliente "+nombre);
                                                                    direccionEntrega[y]=sc.nextLine();
                                                                    System.out.println(nombreCliente[y]+" |   "+tipoDocumento[y]+"    |   "+numeroDocumento[y]+"   |   "+direccionEntrega[y]+"  |   "+celular[y]+"   |   "+email[y]);
                                                                }
                                                            }
                                                        }
                                                        case 2->{
                                                            System.out.println("Ingresar el nombre del cliente a actualizar");
                                                            nombre=sc.nextLine();
                                                            for(int y=0;y<nombreCliente.length;y++){
                                                                if(nombre.equals(nombreCliente[y])){System.out.println("Ingresar el nuevo numero de celular del cliente "+nombre);
                                                                    celular[y]=sc.nextLine();
                                                                    System.out.println(nombreCliente[y]+" |   "+tipoDocumento[y]+"    |   "+numeroDocumento[y]+"   |   "+direccionEntrega[y]+"  |   "+celular[y]+"   |   "+email[y]);
                                                                }
                                                            }
                                                        }
                                                        case 3->{
                                                            System.out.println("Ingresar el nombre del cliente a actualizar");
                                                            nombre=sc.nextLine();
                                                            for(int y=0;y<nombreCliente.length;y++){
                                                                if(nombre.equals(nombreCliente[y])){System.out.println("Ingresar el nuevo correo electronico del cliente "+nombre);
                                                                    email[y]=sc.nextLine();
                                                                    System.out.println("    Nombres Cliente |   Tipo de dcumento  |   Numero de identificación   |   Direccion entrega   |   Numero de celular |   Correo electronico");
                                                                    for(int p=0;p<indiceClientes;p++){
                                                                        System.out.println(nombreCliente[p]+" |   "+tipoDocumento[p]+"    |   "+numeroDocumento[p]+"   |   "+direccionEntrega[p]+"  |   "+celular[p]+"   |   "+email[p]);}
                                                                }
                                                            }
                                                        }
                                                        case 4->{
                                                            System.out.println("Regresar al menu anterior");
                                                        }
                                                    }
                                                }while (opcion!=4);

                                           }
                                           case 4->{
                                               System.out.println("Ingresar el nombre del cliente a eliminar");
                                               nombre=sc.nextLine();
                                               for(int y=0;y<nombreCliente.length;y++){
                                                   if(nombre.equals(nombreCliente[y])){
                                                       nombreCliente[y]="";
                                                       tipoDocumento[y]="";
                                                       numeroDocumento[y]="";
                                                       direccionEntrega[y]="";
                                                       celular[y]="";
                                                       email[y]="";
                                                       break;}
                                                      else{
                                                           if(y == indiceClientes -1){
                                                               System.out.println("el cliente "+nombre+ " no se encuentra registrado");
                                                           }else {
                                                               continue;
                                                           }
                                                   }
                                               }
                                               System.out.println("    Nombres Cliente |   Tipo de dcumento  |   Numero de identificación   |   Direccion entrega   |   Numero de celular |   Correo electronico");
                                               for(int p=0;p<indiceClientes;p++){
                                                   System.out.println(nombreCliente[p]+" |   "+tipoDocumento[p]+"    |   "+numeroDocumento[p]+"   |   "+direccionEntrega[p]+"  |   "+celular[p]+"   |   "+email[p]);}
                                           }
                                           case 5->{
                                               System.out.println("Regresar al menú anterior");
                                           }
                                       }
                                   } while (opcion != 5);
                               }
                               case 2->{
                                   do {
                                   System.out.println("""
                                   =======================GESTIÓN DE PRODUCTOS==============================
                                   Por favor seleccionar una de las siguientes opciones:
                                       1. Para crear producto
                                       2. Para ver producto
                                       3. Para actualizar producto
                                       4. Para eliminar producto
                                       5. Regresar al menú anterior
                                   """);
                                                   opcion = sc.nextInt();
                                                   sc.nextLine();
                                                   switch (opcion) {
                                                       case 1 -> {
                                                           do {
                                                               System.out.println("=======================Ingresar información del producto==============================");
                                                               System.out.println("Ingresar nombre del producto");
                                                               nombreProducto[indiceProductos]= sc.nextLine();
                                                               System.out.println("Ingresar codigo del Producto");
                                                               codigoProducto[indiceProductos]= sc.nextLine();
                                                               System.out.println("Ingresar Talla del Producto");
                                                               tallaProducto[indiceProductos]= sc.nextLine();
                                                               System.out.println("Ingresar color del producto");
                                                               colorProduto[indiceProductos]= sc.nextLine();
                                                               System.out.println("Ingresar cantidad de productos");
                                                               cantidadProducto[indiceProductos]= sc.nextInt();
                                                               System.out.println("Ingresar precio de productos");
                                                               precioProducto[indiceProductos]= sc.nextDouble();
                                                               indiceProductos++;
                                                               System.out.println("""
                                                          Deseas ingresar a otro cliente
                                                          1. para Si
                                                          2. Para No""");
                                                               respuesta= sc.nextInt();
                                                           }while (respuesta==1 && indiceProductos<tamaño);

                                                       }
                                                       case 2 ->{
                                                           System.out.println("    nombre del producto  |   codigo del Producto  |   Talla del Producto   |   Ingresar color del producto   |   Ingresar cantidad de productos |   Ingresar precio de productos");
                                                           for(int p=0;p<indiceProductos;p++){
                                                               System.out.println(nombreProducto[p]+" |   "+codigoProducto[p]+"    |   "+tallaProducto[p]+"   |   "+colorProduto[p]+"  |   "+cantidadProducto[p]+"   |   "+precioProducto[p]);}
                                                       }
                                                       case 3->{
                                                           do {
                                                               System.out.println("""
                                                                   Por favor seleccionar una de las siguientes opciones:
                                                                   1. Para actualizar precio del Producto
                                                                   2. Para actualizar cantidad del Producto
                                                                   3. Regresar al menú anterior""");
                                                               opcion=sc.nextInt();
                                                               sc.nextLine();
                                                               switch (opcion){
                                                                   case 1->{
                                                                       System.out.println("Ingresar el nombre del producto a actualizar");
                                                                       nombre=sc.nextLine();
                                                                       for(int y=0;y<nombreProducto.length;y++){
                                                                           if(nombre.equals(nombreProducto[y])){System.out.println("Ingresar el precio del Producto "+nombre);
                                                                               precioProducto[y]=sc.nextDouble();
                                                                               System.out.println("    nombre del producto  |   codigo del Producto  |   Talla del Producto   |   Ingresar color del producto   |   Ingresar cantidad de productos |   Ingresar precio de productos");
                                                                               System.out.println(nombreProducto[y]+" |   "+codigoProducto[y]+"    |   "+tallaProducto[y]+"   |   "+colorProduto[y]+"  |   "+cantidadProducto[y]+"   |   "+precioProducto[y]);
                                                                           }
                                                                       }
                                                                   }
                                                                   case 2->{
                                                                       System.out.println("Ingresar el nombre del producto a actualizar");
                                                                       nombre=sc.nextLine();
                                                                       for(int y=0;y<nombreProducto.length;y++){
                                                                           if(nombre.equals(nombreProducto[y])){System.out.println("Ingresar la cantidad del Producto "+nombre);
                                                                               cantidadProducto[y]=sc.nextInt();
                                                                               System.out.println("    nombre del producto  |   codigo del Producto  |   Talla del Producto   |   Ingresar color del producto   |   Ingresar cantidad de productos |   Ingresar precio de productos");
                                                                               System.out.println(nombreProducto[y]+" |   "+codigoProducto[y]+"    |   "+tallaProducto[y]+"   |   "+colorProduto[y]+"  |   "+cantidadProducto[y]+"   |   "+precioProducto[y]);
                                                                           }
                                                                       }
                                                                   }
                                                                   case 3->{
                                                                       System.out.println("Regresar al menu anterior");
                                                                   }
                                                               }
                                                           }while (opcion!=3);
                                                       }
                                                       case 4->{
                                                           System.out.println("Ingresar el nombre del producto a eliminar");
                                                           nombre=sc.nextLine();
                                                           for(int y=0;y<nombreProducto.length;y++){
                                                               if(nombre.equals(nombreProducto[y])){
                                                                   nombreProducto[y]="";
                                                                   codigoProducto[y]="";
                                                                   tallaProducto[y]="";
                                                                   colorProduto[y]="";
                                                                   cantidadProducto[y]=0;
                                                                   precioProducto[y]=0;
                                                                   break;}
                                                               else{
                                                                   if(y == indiceProductos -1){
                                                                       System.out.println("el producto "+nombre+ " no se encuentra registrado");
                                                                   }else {
                                                                       continue;
                                                                   }
                                                               }
                                                           }
                                                           System.out.println("    nombre del producto  |   codigo del Producto  |   Talla del Producto   |   Ingresar color del producto   |   Ingresar cantidad de productos |   Ingresar precio de productos");
                                                           for(int p=0;p<indiceProductos;p++){
                                                               System.out.println(nombreProducto[p]+" |   "+codigoProducto[p]+"    |   "+tallaProducto[p]+"   |   "+colorProduto[p]+"  |   "+cantidadProducto[p]+"   |   "+precioProducto[p]);}
                                                       }
                                                       case 5->{
                                                           System.out.println("Regresar al menú anterior");
                                                       }
                                                   }
                                               } while (opcion != 5);
                               }
                               case 3->{
                                   do {
                                   System.out.println("""
                                   =======================GESTIÓN DE VENTAS==============================
                                   Por favor seleccionar una de las siguientes opciones:
                                       1. Para crear venta
                                       2. Para ver venta
                                       3. Para actualizar venta
                                       4. Para eliminar venta
                                       5. Salir
                                   """);
                                           opcion = sc.nextInt();
                                           sc.nextLine();
                                           switch (opcion) {
                                               case 1 -> {
                                                   do {
                                                       System.out.println("=======================Ingresar información de la factura==============================");
                                                       System.out.println("Seleccione el cliente:");
                                                       for (int i = 0; i < indiceClientes; i++) {
                                                           System.out.println((i + 1) + ". " + nombreCliente[i] + " - " + numeroDocumento[i]);
                                                       }
                                                       int opcionCliente = sc.nextInt();
                                                       sc.nextLine();
                                                       clienteVenta[indiceVentas] = nombreCliente[opcionCliente - 1];
                                                       System.out.println("Seleccione el producto:");
                                                       for (int i = 0; i < indiceProductos; i++) {
                                                           System.out.println((i + 1) + ". " + nombreProducto[i] + " - $" + precioProducto[i]);
                                                       }
                                                       int opcionProducto = sc.nextInt();
                                                       sc.nextLine();
                                                       productoVenta[indiceVentas] = nombreProducto[opcionProducto - 1];
                                                       System.out.println("Ingresar Numero factura");
                                                       numFactura[indiceVentas]= sc.nextLine();
                                                       System.out.println("Ingresar fecha factura (dd/mm/aaaa)");
                                                       fecha[indiceVentas]= sc.nextLine();

                                                       System.out.println("Cantidad comprada:");
                                                       cantidadVenta[indiceVentas] = sc.nextInt();
                                                       sc.nextLine();
                                                       totalVenta[indiceVentas] = cantidadVenta[indiceVentas] * precioProducto[opcionProducto - 1];

                                                       System.out.println("Ingresar forma de pago");
                                                       formaPagoID[indiceVentas]= sc.nextLine();
                                                       indiceVentas++;
                                                       System.out.println("""
                                                          Deseas ingresar otra venta
                                                          1. para Si
                                                          2. Para No""");
                                                       respuesta= sc.nextInt();
                                                   }while (respuesta==1 && indiceVentas<tamaño);

                                               }
                                               case 2 ->{
                                                   System.out.println(" Nombre Cliente  |   Nombre producto  |    Numero factura |   fecha   |   Cantidad de producto    |   Valor total    |   Forma de pago   ");
                                                   for(int p=0;p<indiceVentas;p++){
                                                       System.out.println( clienteVenta[p]+"    |   "+productoVenta[p]+" |   "+numFactura[p]+" |   "+fecha[p]+" |   "+cantidadVenta[p]+" |   "+totalVenta[p]+"    |   "+ formaPagoID[p]);}
                                               }
                                               case 3->{
                                                   do {
                                                       System.out.println("""
                                                       Por favor seleccionar una de las siguientes opciones:
                                                       1. Para actualizar forma de pago
                                                       2. Para actualizar fecha de la factura
                                                       3. Regresar al menú anterior""");
                                                       opcion=sc.nextInt();
                                                       sc.nextLine();
                                                       switch (opcion){
                                                           case 1->{
                                                               System.out.println("Ingresar Numero de factura a organizar");
                                                               numeroFactura=sc.nextLine();
                                                               for(int y=0;y<numFactura.length;y++){
                                                                   if(numeroFactura.equals(numFactura[y])){System.out.println("Ingresar la forma de pago a actualizar "+numeroFactura);
                                                                       formaPagoID[y]=sc.nextLine();
                                                                       System.out.println( clienteVenta[y]+"    |   "+productoVenta[y]+" |   "+numFactura[y]+" |   "+fecha[y]+" |   "+cantidadVenta[y]+" |   "+totalVenta[y]+"    |   "+ formaPagoID[y]);}

                                                               }
                                                           }
                                                           case 2->{
                                                               System.out.println("IngresarNumero de factura a organizar");
                                                               numeroFactura=sc.nextLine();
                                                               for(int y=0;y<numFactura.length;y++){
                                                                   if(numeroFactura.equals(numFactura[y])){System.out.println("Ingresar la nueva fecha de la factura a actualizar "+numeroFactura);
                                                                       fecha[y]=sc.nextLine();
                                                                       System.out.println( clienteVenta[y]+"    |   "+productoVenta[y]+" |   "+numFactura[y]+" |   "+fecha[y]+" |   "+cantidadVenta[y]+" |   "+totalVenta[y]+"    |   "+ formaPagoID[y]);
                                                                   }
                                                               }
                                                           }
                                                           case 3->{
                                                               System.out.println("Regresar al menu anterior");
                                                           }
                                                       }
                                                   }while (opcion!=3);
                                               }
                                               case 4->{
                                                   System.out.println("Ingresar el numero la factura a eliminar");
                                                   numeroFactura=sc.nextLine();
                                                   for(int y=0;y<numFactura.length;y++){
                                                       if(numeroFactura.equals(numFactura[y])){
                                                           numFactura[y]="";
                                                           fecha [y]="";
                                                           formaPagoID[y]="";
                                                           clienteVenta[y]="";
                                                           productoVenta[y]="";
                                                           cantidadVenta[y]=0;
                                                           totalVenta[y]=0;
                                                           break;}
                                                       else{
                                                           if(y == indiceVentas -1){
                                                               System.out.println("el nuemro de factura "+numeroFactura+ " no se encuentra registrado");
                                                           }else {
                                                               continue;
                                                           }
                                                       }
                                                   }
                                                   System.out.println(" Nombre Cliente  |   Nombre producto  |    Numero factura |   fecha   |   Cantidad de producto    |   Valor total    |   Forma de pago   ");
                                                   for(int p=0;p<indiceVentas;p++){
                                                       System.out.println( clienteVenta[p]+"    |   "+productoVenta[p]+" |   "+numFactura[p]+" |   "+fecha[p]+" |   "+cantidadVenta[p]+" |   "+totalVenta[p]+"    |   "+ formaPagoID[p]);}
                                               }
                                               case 5->{
                                                   System.out.println("Regresar al menú anterior");
                                               }
                                           }
                                       } while (opcion != 5);
                                   }
                               case 4->{System.out.println("Volver al menú anterior");
                               }
                           }

                       }while (opcion != 4);
                    }
                    else {
                        System.out.println("Contraseña invalida intente de nuevo");
                    }
                }
                case 2 ->{
                  do {
                      System.out.println("""
                    =======================MENÚ CLIENTES==============================
                    Por favor seleccionar una de las siguientes opciones:
                        1. para crear Cuenta
                        2. Para inciar sesión
                        3. Salir
                    """);
                      opcion= sc.nextInt();
                      sc.nextLine();
                      switch (opcion){
                          case 1->{
                              System.out.println("Nombre usuario");
                              usuarioCliente[indiceUsuarioClientes]=sc.nextLine();
                              System.out.println("Ingresar contraseña");
                              claveCliente[indiceUsuarioClientes]=sc.nextInt();
                              indiceUsuarioClientes++;
                              System.out.println("Cuenta creada con exito");
                              break;
                          }
                          case 2->{
                              System.out.println("Ingresar nombre de usuario");
                              usuarioclienteacc=sc.nextLine();
                              System.out.println("Ingresar contraseña");
                              contraseñaCliente= sc.nextInt();
                              for (int i = 0; i < indiceUsuarioClientes; i++) {
                                  if (usuarioCliente[i].equals(usuarioclienteacc) && claveCliente[i]==(contraseñaCliente)) {
                                      do {
                                          System.out.println("""
                                   =======================MENÚ DE CLIENTES==============================
                                   Por favor seleccionar una de las siguientes opciones:
                                       1. Ver productos
                                       2. Comprar productos
                                       3. Ver compras
                                       4. Salir
                                   """);
                                          opcion= sc.nextInt();
                                          sc.nextLine();
                                       switch (opcion){
                                           case 1->{
                                                   System.out.println("========== LISTA DE PRODUCTOS ==========");
                                                   if (indiceProductos == 0) {
                                                       System.out.println("No hay productos registrados.");
                                                   } else {
                                                       for (int p = 0; p < indiceProductos; p++) {
                                                           System.out.println((p + 1) + ". "
                                                                   + nombreProducto[p] + " | Código: " + codigoProducto[p]
                                                                   + " | Talla: " + tallaProducto[p]
                                                                   + " | Color: " + colorProduto[p]
                                                                   + " | Cantidad: " + cantidadProducto[p]
                                                                   + " | Precio: $" + precioProducto[p]);
                                                       }
                                                   }
                                           }
                                           case 2->{

                                           }
                                           case 3->{
                                           }
                                           case 4->{
                                               System.out.println("Regresar al menú anterior");
                                           }
                                       }



                                      }while (opcion!=4);
                                  }else {
                                      System.out.println("Contraseña incorrecta");
                                  }
                                  break;
                              }
                          }
                          case 3->{
                              System.out.println("Regresar al menú anterior");
                          }
                      }
                  }while (opcion!=3);
                }
                case 3 ->{
                    System.out.println("""
                            Muchas gracias Vuelva pronto""");
                }
                default -> {
                    System.out.println("Selección invalida por favor intentar de nuevo");
                }
            }
        }while (opcion != 3);
    }
}

