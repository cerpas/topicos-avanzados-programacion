/*
 * Created by SharpDevelop.
 * User: cerpas
 * Date: 2/13/2025
 * Time: 8:18 AM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace ListViewEjemplo
{
	/// <summary>
	/// Description of MainForm.
	/// </summary>
	public partial class MainForm : Form
	{
		public MainForm()
		{
			//
			// The InitializeComponent() call is required for Windows Forms designer support.
			//
			InitializeComponent();
			
			//
			// TODO: Add constructor code after the InitializeComponent() call.
			//
		}
		void Button1Click(object sender, EventArgs e)
		{
			if (!textBox2.Text.Contains("@")){
				MessageBox.Show("Correo invalido");
			}
			else{
			ListViewItem lista = new ListViewItem(textBox1.Text);
		    lista.SubItems.Add(textBox2.Text);
		    listView1.Items.Add(lista);
			}
			
		}
		void TextBox1KeyPress(object sender, KeyPressEventArgs e)
		{
			if (!((e.KeyChar >= 'a' && e.KeyChar <= 'z') ||
			      (e.KeyChar >= 'A' && e.KeyChar <= 'Z'))
			    &&  e.KeyChar != 8 && e.KeyChar != 32){
				e.Handled = true;
			}
		}
		void TextBox2KeyPress(object sender, KeyPressEventArgs e)
		{
	         
		}
	}
}
