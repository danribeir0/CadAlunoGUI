package dao;

import beans.Aluno;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private Conexao conexao;
    private Connection connection;

    public AlunoDAO() {
        conexao = new Conexao();
        connection = conexao.getConexao();
    }

    public void inserir(Aluno aluno) {
        String sql = "INSERT INTO alunos(nome, nota1, nota2, nota3) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, aluno.getNome());
            statement.setDouble(2, aluno.getNota1());
            statement.setDouble(3, aluno.getNota2());
            statement.setDouble(4, aluno.getNota3());
            statement.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir ALUNO - " + e.getMessage());
        }
    }
    
    public int getId(){
        try {
            ResultSet resultSet = connection.prepareStatement("SELECT LAST_INSERT_ID()").executeQuery();
            while(resultSet.next()){
                return resultSet.getInt("LAST_INSERT_ID()");
            }
            return -1;
        } catch (Exception e) {
            System.out.println("Erro ao tentar pegar ID do Aluno - " + e.getMessage());
            return -1;
        }
    }
    
    public Aluno getAluno(Aluno aluno){
        String sql = "SELECT * FROM alunos WHERE nome = ? and nota1 = ? and nota2 = ? and nota3 = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(0, aluno.getNome());
            statement.setDouble(1, aluno.getNota1());
            statement.setDouble(2, aluno.getNota2());
            statement.setDouble(3, aluno.getNota3());
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                aluno.setId(resultSet.getInt("id"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setNota1(resultSet.getDouble("nota1"));
                aluno.setNota2(resultSet.getDouble("nota2"));
                aluno.setNota3(resultSet.getDouble("nota3"));
            }
            return aluno;
        } catch (Exception e) {
            System.out.println("Erro \"getAluno\": " + e.getMessage());
            return null;
        }
    }
    
    public List<Aluno> getAlunos(){
        String sql = "SELECT * FROM alunos";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            List<Aluno> listaAlunos = new ArrayList<>();
            while(resultSet.next()){
                Aluno aluno = new Aluno();
                aluno.setId(resultSet.getInt("id"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setNota1(resultSet.getDouble("nota1"));
                aluno.setNota2(resultSet.getDouble("nota2"));
                aluno.setNota3(resultSet.getDouble("nota3"));
                listaAlunos.add(aluno);
            }
            return listaAlunos;
        } catch (Exception e) {
            System.out.println("Erro Listar alunos para tabela: " + e.getMessage());
            return null;
        }
    }
}
