;; restrictions: max, max-key

(defn gt [a b]
  (if (> a b)
    a
    b))

(defn mx [& args]
  (reduce gt args))


(= (mx 1 8 3 4) 8)

(= (mx 30 20) 30)

(= (mx 45 67 11) 67)

;; (fn [& args] (reduce #(if (> %1 %2) %1 %2) args))
