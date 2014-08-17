(defn oscil [v & fns]
  (map #((reduce comp (reverse (take % (cycle fns)))) v) (range)))


(= (take 3 (oscil 3.14 int double)) [3.14 3 3.0])

(= (take 5 (oscil 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7])

(= (take 12 (oscil 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])