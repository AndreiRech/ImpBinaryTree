// Adicione esta parte em uma nova classe RedBlackTree.java

import java.util.*;

class RedBlackTree {
    private Node root;
    private TreeFormatter treeFormatter;

    public RedBlackTree() {
        this.root = null;
        this.treeFormatter = new TreeFormatter();
    }

    // Métodos da árvore Red-Black


    //ADICIONAR NODO
    public void add(Integer data) {
        this.root = addRecursive(this.root, data);
    }

    private Node addRecursive(Node current, Integer data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.element) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.element) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }


    //ACHAR NODO PAI
    public Integer getParent(Integer data) {
        return findParent(root, data, null);
    }

    private Integer findParent(Node current, Integer data, Integer parentData) {
        if (current == null) {
            return null;
        }

        if (data.equals(current.element)) {
            return parentData;
        }

        if (data < current.element) {
            return findParent(current.left, data, current.element);
        } else {
            return findParent(current.right, data, current.element);
        }
    }


    //LIMPAR
    public void clear() {
        root = null;
    }


    //PROCURA POR ELEMENTO
    public boolean contains(Integer data) {
        return containsNode(root, data);
    }

    private boolean containsNode(Node current, Integer data) {
        if (current == null) {
            return false;
        }

        if (data.equals(current.element)) {
            return true;
        }

        if (data < current.element) {
            return containsNode(current.left, data);
        } else {
            return containsNode(current.right, data);
        }
    }


    //ALTURA
    public int height() {
        return calculateHeight(root);
    }

    private int calculateHeight(Node current) {
        if (current == null) {
            return -1; // altura de uma árvore vazia é -1
        } else {
            int leftSubtreeHeight = calculateHeight(current.left);
            int rightSubtreeHeight = calculateHeight(current.right);

            // altura é a maior altura entre as subárvores + 1 (incluindo o nó atual)
            return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
        }
    }

    //TAMANHO
    public int size() {
        return calculateSize(root);
    }

    private int calculateSize(Node current) {
        if (current == null) {
            return 0;
        } else {
            return 1 + calculateSize(current.left) + calculateSize(current.right);
        }
    }


    //VAZIA
    public boolean isEmpty() {
        return root == null;
    }


    //PRE-ORDEM
    public List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }

    private void preOrderTraversal(Node current, List<Integer> list) {
        if (current != null) {
            list.add(current.element);
            preOrderTraversal(current.left, list);
            preOrderTraversal(current.right, list);
        }
    }


    //ORDEM CENTRAR
    public List<Integer> inOrder() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private void inOrderTraversal(Node current, List<Integer> list) {
        if (current != null) {
            inOrderTraversal(current.left, list);
            list.add(current.element);
            inOrderTraversal(current.right, list);
        }
    }


    //POS-ORDEM
    public List<Integer> posOrder() {
        List<Integer> result = new ArrayList<>();
        posOrderTraversal(root, result);
        return result;
    }

    private void posOrderTraversal(Node current, List<Integer> list) {
        if (current != null) {
            posOrderTraversal(current.left, list);
            posOrderTraversal(current.right, list);
            list.add(current.element);
        }

    }

    public String visualizeTree() {
        return treeFormatter.topDown(root);
    }
}

