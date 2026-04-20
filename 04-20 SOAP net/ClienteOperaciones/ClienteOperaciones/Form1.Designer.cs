namespace ClienteOperaciones
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            txtA = new TextBox();
            label2 = new Label();
            txtB = new TextBox();
            label3 = new Label();
            cbOperacion = new ComboBox();
            button1 = new Button();
            lblRespuesta = new Label();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(35, 51);
            label1.Name = "label1";
            label1.Size = new Size(13, 15);
            label1.TabIndex = 0;
            label1.Text = "a";
            // 
            // txtA
            // 
            txtA.Location = new Point(70, 48);
            txtA.Name = "txtA";
            txtA.Size = new Size(100, 23);
            txtA.TabIndex = 1;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(31, 98);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 2;
            label2.Text = "b";
            // 
            // txtB
            // 
            txtB.Location = new Point(84, 97);
            txtB.Name = "txtB";
            txtB.Size = new Size(100, 23);
            txtB.TabIndex = 3;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(31, 145);
            label3.Name = "label3";
            label3.Size = new Size(60, 15);
            label3.TabIndex = 4;
            label3.Text = "operacion";
            // 
            // cbOperacion
            // 
            cbOperacion.FormattingEnabled = true;
            cbOperacion.Items.AddRange(new object[] { "Suma", "Resta", "Multiplicacion", "Division" });
            cbOperacion.Location = new Point(91, 147);
            cbOperacion.Name = "cbOperacion";
            cbOperacion.Size = new Size(121, 23);
            cbOperacion.TabIndex = 5;
            // 
            // button1
            // 
            button1.Location = new Point(39, 200);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 6;
            button1.Text = "calcular";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // lblRespuesta
            // 
            lblRespuesta.AutoSize = true;
            lblRespuesta.Location = new Point(47, 260);
            lblRespuesta.Name = "lblRespuesta";
            lblRespuesta.Size = new Size(57, 15);
            lblRespuesta.TabIndex = 7;
            lblRespuesta.Text = "respuesta";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(lblRespuesta);
            Controls.Add(button1);
            Controls.Add(cbOperacion);
            Controls.Add(label3);
            Controls.Add(txtB);
            Controls.Add(label2);
            Controls.Add(txtA);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private TextBox txtA;
        private Label label2;
        private TextBox txtB;
        private Label label3;
        private ComboBox cbOperacion;
        private Button button1;
        private Label lblRespuesta;
    }
}
