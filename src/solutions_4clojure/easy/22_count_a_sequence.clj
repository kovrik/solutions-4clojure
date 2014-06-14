(defn cnt [s]
  (loop [st s
         n 0]
    (if (empty? st)
      n
      (recur (rest st) (+ n 1)))))

(= (cnt '(1 2 3 3 1)) 5)

(= (cnt "Hello World") 11)

(= (cnt [[1 2] [3 4] [5 6]]) 3)

(= (cnt '(13)) 1)

(= (cnt '(:a :b :c)) 3)
