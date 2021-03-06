package tienda;

import java.io.IOException;
import java.time.LocalDateTime;

import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Pedido {

	
	private static int codPedido = 1;
	private int codigo;
	ArrayList<LineaPedido> linea;
	private LocalDateTime fecha;
	private double total; //hay que calcularlo
	private Cliente cliente; //hay que usar setCliente
	
	
	public Pedido() {
		super();
		this.codigo = Pedido.codPedido;
		Pedido.codPedido++;
		this.fecha = LocalDateTime.now();
		this.linea = new ArrayList<>();
		this.total = 0;
	}
	
	/**
	 * Constructor con cliente
	 * @param cliente
	 */
	public Pedido(Cliente cliente) {
		super();
		this.codigo = Pedido.codPedido;
		Pedido.codPedido++;
		this.fecha = LocalDateTime.now();
		this.linea = new ArrayList<>();
		this.cliente = cliente;
		this.total = 0;
	}
	
	
	/**
	 * devuelve el precio total
	 * @return
	 */
	public double total() {
		//el total se actualiza cada vez que se a?ade una nueva linea pedido con el metodo nueva linea
		return this.total-this.cliente.descuento();
	}
	
	/**
	 * Devuelve el arraylist
	 * @return
	 */
	public ArrayList<LineaPedido> getLineas() {
		return this.linea;
	}
	
	public void nuevaLinea(LineaPedido lp) {
		//en caso de haber una lina igual la fusiona en vez de a?adirla
		boolean encontrado = false;
		for(LineaPedido li : linea) {
			if(li.getProducto().equals(lp.getProducto())) {
				encontrado = true;
				li.setCantidad(li.getCantidad()+lp.getCantidad());
				this.total += lp.subtotal();
			}
		}
		if(!encontrado) {
			linea.add(lp);
			this.total += lp.subtotal();
		}
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido: ");
		builder.append(codigo);
		//salto de linea
		builder.append("\n");
		for(LineaPedido li : linea) {
			builder.append("Prod: ");
			builder.append(li.getProducto().getCodigo());
			builder.append(" precio: ");
			builder.append(li.getProducto().getPrecio());
			builder.append(" cantidad: ");
			builder.append(li.getCantidad());
			builder.append(" subtotal: ");
			builder.append(li.subtotal());
			builder.append("? \n");
		}
		builder.append("Total: ");
		builder.append(total());
		builder.append("? \n");
		return builder.toString();
	}
	
	
	public void toPDF() throws IOException {
		 try (PDDocument document = new PDDocument()) {
	            PDPage page = new PDPage(PDRectangle.A6);
	            document.addPage(page);

	            PDPageContentStream contentStream = new PDPageContentStream(document, page);

	            // Text
	            contentStream.beginText();
	            contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
	            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
	            contentStream.showText("Pedido: "+this.codigo);
	            contentStream.endText();
	            
	            
	            if(cliente!=null) {
	            	contentStream.beginText();
	            	contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
		            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 80);
		            contentStream.showText("Cliente: "+cliente.getDni()+" "+cliente.getApellidos()+" "+cliente.getNombre());
		          
	            	contentStream.newLineAtOffset(0, -15);
	            	contentStream.showText("Direccion: "+cliente.getDireccion()+" "+cliente.getLocalidad());
	            	contentStream.endText();
	            }
	            
	            contentStream.beginText();
	            contentStream.setFont(PDType1Font.COURIER,5);
	            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 150);
	            for(LineaPedido li : linea) {
	            	contentStream.showText("Prod: "+li.getProducto().getCodigo());
	            	contentStream.showText(" precio "+li.getProducto().getPrecio());
	            	contentStream.showText(" cantidad "+li.getCantidad());
	            	contentStream.showText(" subtotal "+li.subtotal());
	            	contentStream.newLineAtOffset(0, -25);
	            }
	            contentStream.showText("Total: "+total());
	            contentStream.endText();
	            contentStream.close();

	            document.save(this.codigo+"document.pdf");
		 }
	}
	
	
}
