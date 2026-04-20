namespace ClienteHolaMundo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Servicio.SerivicioIncialSoapClient cliente = new Servicio.SerivicioIncialSoapClient(Servicio.SerivicioIncialSoapClient.EndpointConfiguration.SerivicioIncialSoap12);
            
            string mensaje = cliente.HolaMundo();
            lblRespuesta.Text = mensaje;

        }
    }
}
