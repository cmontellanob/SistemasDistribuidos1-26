namespace ClienteOperaciones
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtB.Text);
            
            Operaciones.OperacionesBasicasSoapClient client = new Operaciones.OperacionesBasicasSoapClient(Operaciones.OperacionesBasicasSoapClient.EndpointConfiguration.OperacionesBasicasSoap12);
                
            switch (cbOperacion.SelectedItem.ToString())
            {
                case "Suma":
                    lblRespuesta.Text = client.Sumar(a, b).ToString();
                    break;
                case "Resta":
                    lblRespuesta.Text = client.Restar(a, b).ToString();
                    break;
                case "Multiplicación":
                    lblRespuesta.Text = client.Multiplicar(a, b).ToString();
                    break;
                case "División":
                    lblRespuesta.Text = client.Dividir(a, b).ToString();
                    break;
            }


        }
    }
}
