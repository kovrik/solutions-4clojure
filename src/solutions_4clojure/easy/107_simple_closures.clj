(defn exp [n]
  #(reduce *' (repeat n %)))

(= 256 ((exp 2) 16), ((exp 8) 2))

(= [1 8 27 64] (map (exp 3) [1 2 3 4]))

(= [1 2 4 8 16] (map #((exp %) 2) [0 1 2 3 4]))
