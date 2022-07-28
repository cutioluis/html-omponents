package test;

public class app {
   public static void main(String[] args) {

      // Primefaces 8.0/27/07/2022
      DefaultStreamedContent archivoPDF = DefaultStreamedContent
            .builder()
            .contentType("application/pdf")
            .stream(() -> new ByteArrayInputStream(file)).build();

      // Meunu Item utilizando Primefaces 6.0/27/07/2022
      // DefaultMenuItem menutItem = new
      // DefaultMenuItem(recursos.get(i).getNombrerecurso());
      // menutItem.setIcon("icon-arrow-right");
      // menutItem.setUrl(recursos.get(i).getPaginarecurso().concat(".xhtml"));
      // model.addElement(menutItem);

      // Menu Item utilizando Primefaces 10.0/27/07/2022
      DefaultMenuItem menutItem = DefaultMenuItem.builder()
            .value(recursos.get(i).getNombrerecurso())
            .url(recursos.get(i).getPaginarecurso().concat(".xhtml"))
            .icon("icon-arrow-right")
            .build();
      model.getElements().add(menutItem);
      
   }
}
